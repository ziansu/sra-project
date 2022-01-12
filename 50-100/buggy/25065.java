@java.lang.Override
public synchronized void run() {
    byte[] frame;
    while (stateFrame) {
        frame = _ctrl.getModel().simulation_frame_color();
        try {
            queue.put(frame);
            java.lang.System.out.println("PUT");
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}