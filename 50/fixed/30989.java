public void off(java.lang.String event, io.socket.emitter.Emitter.Listener callback) {
    if ((socketService) == null)
        return ;
    
    socketService.off(event, callback);
}