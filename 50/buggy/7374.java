public void close() {
    if ((this.timer) != null)
        this.timer.cancel();
    
    this.websocket.close();
}