public void close() {
    if (((this.socket) != null) && (this.socket.isConnected())) {
        try {
            if ((this.reader) != null)
                this.reader.close();
            
            if ((this.writer) != null)
                this.writer.close();
            
            this.socket.close();
        } catch (java.lang.Throwable t) {
            t.printStackTrace();
        }
    }else
        this.dispatchErrorListener("Error: Connection is not open.");
    
}