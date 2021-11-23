public void run() {
    while (true) {
        java.lang.System.out.println("Getting robot position");
        getRobotPosition();
        java.lang.System.out.println("Sending it to feeder proxy");
        outStream.println(positionToString());
        java.lang.System.out.println(positionToString());
        try {
            java.lang.Thread.sleep(50);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}