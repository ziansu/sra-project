public void close(boolean noEvent) {
    synchronized(Main.genSync) {
        Main.clients.remove(this);
        try {
            thread.stop();
            if (!noEvent)
                reader.removed();
            
            socket.close();
        } catch (java.lang.Exception e) {
            com.pecacheu.genctrl.Main.err("Could not close socket!", e);
        }
    }
}