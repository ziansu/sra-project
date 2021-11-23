protected void setUpdateAction(java.util.function.Consumer<java.lang.Void> action) {
    synchronized(this) {
        while ((updateAction) != null) {
            try {
                this.wait();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
                java.lang.System.exit(1);
            }
        } 
        updateAction = action;
    }
}