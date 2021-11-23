public static void startup() {
    java.lang.System.out.println("Startup()");
    os.jobTable = new java.util.LinkedList<PCB>();
    os.createdQueue = new java.util.LinkedList<PCB>();
    os.readyQueue = new java.util.LinkedList<PCB>();
    os.waitingQueue = new java.util.LinkedList<PCB>();
    os.ioQueue = new java.util.LinkedList<PCB>();
    os.Swapper = new Swapper();
    sos.ontrace();
}