public void run() {
    java.lang.System.out.println("Thread Started");
    while (true) {
        plugin.calculateIslandLevel();
        try {
            java.lang.Thread.sleep(((plugin.getConfig().getInt("time")) * 1000));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}