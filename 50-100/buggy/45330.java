public void run() {
    while (Mazewar.leader.equals(Mazewar.localClient.getName())) {
        Mazewar.localClient.sendTick();
        try {
            java.lang.Thread.sleep(200);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}