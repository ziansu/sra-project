private void usePush() {
    if ((folder) == null)
        return ;
    
    java.lang.Runnable r = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                folder.idle(false);
            } catch (java.lang.Exception e) {
            }
        }
    };
    pushThread = new java.lang.Thread(r, ("Push-" + (accountName)));
    pushThread.setDaemon(true);
    pushThread.start();
}