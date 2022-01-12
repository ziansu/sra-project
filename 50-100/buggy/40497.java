public void close(boolean noEvent) {
    synchronized(Main.genSync) {
        try {
            thread.stop();
            Main.clients.remove(this);
            if (!noEvent)
                reader.removed();
            
            socket.close();
            socket = null;
        } catch (java.lang.Exception e) {
            com.pecacheu.genctrl.Main.err("Could not close socket!", e);
        }
    }
}