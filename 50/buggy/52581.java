public void sendError(java.lang.String msg) {
    de.htwsaar.chessbot.engine.io.Logger.getInstance().log(msg, Logger.ERROR);
    if (!(this.showError))
        return ;
    
    java.lang.System.out.println(("[ERROR]" + msg));
}