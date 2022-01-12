public void setUpdateAction(java.util.function.Consumer<java.lang.Void> action) {
    synchronized(model) {
        while ((updateAction) != null) {
            try {
                model.wait();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                java.lang.System.exit(1);
            }
        } 
        updateAction = action;
        model.notifyAll();
    }
}