public static void main(java.lang.String... args) throws java.lang.InterruptedException {
    net.hazmatrobotics.lightshow.coordinators.MainCoordinator.server = new net.hazmatrobotics.lightshow.ShowServer(80);
    net.hazmatrobotics.lightshow.coordinators.MainCoordinator.server.run();
    java.lang.System.out.println("Version 2");
    java.lang.System.out.println("Boot.");
    while (true) {
        java.lang.Thread.sleep(100);
    } 
}