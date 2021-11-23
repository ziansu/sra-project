@java.lang.Override
public synchronized void run() {
    byte[] frame;
    try {
        while (stateFrame) {
            java.lang.System.out.println(stateFrame);
            frame = _ctrl.getModel().simulation_frame_color();
            queue.put(frame);
            java.lang.System.out.println("PUT");
        } 
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}