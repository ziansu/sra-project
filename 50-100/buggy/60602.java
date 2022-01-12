void addChanges(com.mousebird.maply.ChangeSet newChanges) {
    synchronized(changes) {
        changes.merge(newChanges);
        if ((changeHandler) == null) {
            changeHandler = addTask(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    synchronized(changes) {
                        changeHandler = null;
                        changes.process(scene);
                    }
                }
            }, true);
        }
    }
}