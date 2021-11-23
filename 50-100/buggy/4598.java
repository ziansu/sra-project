@java.lang.Override
public void onGamePadCustomMessageReceived(java.lang.String customMessage, int gamepad) {
    if (isGamePadConnected(gamepad))
        return ;
    
    final com.fbessou.sofa.GameIOHelper.GamePadCustomMessage gpCustom = new com.fbessou.sofa.GameIOHelper.GamePadCustomMessage();
    gpCustom.customMessage = customMessage;
    gpCustom.gamePadId = gamepad;
    if ((mode) == (com.fbessou.sofa.GameIOHelper.Mode.LISTENER)) {
        if ((mCustomMessageListener) != null) {
            com.fbessou.sofa.GameIOHelper.handler.post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    mCustomMessageListener.onCustomMessageReceived(gpCustom);
                }
            });
        }
    }else {
        mCustomMessageQueue.offer(gpCustom);
    }
}