@java.lang.Override
public void shutdown() {
    java.lang.System.out.println("Shutting down colour tracking module...");
    cap.release();
    frame.dispose();
    running = false;
    java.lang.System.out.println("done");
}