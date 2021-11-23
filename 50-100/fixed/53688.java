@java.lang.Override
public void onData(com.corundumstudio.socketio.SocketIOClient client, java.lang.String data, com.corundumstudio.socketio.AckRequest ackRequest) {
    if (data.equals("restart")) {
        java.lang.System.out.println("Restarting game\n");
    }else
        if (data.equals("menu")) {
            java.lang.System.out.println("Returning to menu (stop db)\n");
            if ((com.BenchpressServer.timer) != null) {
                com.BenchpressServer.timer.cancel();
                com.BenchpressServer.timer.purge();
                com.BenchpressServer.timer = null;
            }
        }else {
            java.lang.System.out.println((("Unrecognized gameover option: " + data) + "\n"));
        }
    
    com.BenchpressServer.targetHeight = com.BenchpressServer.defaultHeight;
    com.BenchpressServer.actualHeight = com.BenchpressServer.defaultHeight;
}