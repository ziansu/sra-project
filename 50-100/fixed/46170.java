public void stopWatching() {
    if ((watcher) != null) {
        try {
            java.lang.System.out.println("Watcher stop called");
            if ((key) != null)
                key.cancel();
            
            watcher.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}