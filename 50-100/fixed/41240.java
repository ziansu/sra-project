@java.lang.Override
public void run() {
    try {
        while (!(t.isInterrupted())) {
            java.lang.Thread.sleep(0, 1);
            synchronized(stream) {
                if (stream.needsFlush())
                    stream.flush();
                
                stream.notifyAll();
            }
        } 
    } catch (java.io.IOException e) {
        controller.StreamHandler.LOGGER.log(java.util.logging.Level.SEVERE, e.toString());
    } catch (java.lang.InterruptedException e) {
    }
}