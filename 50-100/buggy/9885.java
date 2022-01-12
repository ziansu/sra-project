private void updateReady(java.util.List<com.kilobolt.framework.Input.TouchEvent> touchEvents) {
    if (!(otherSizeIsSet)) {
        bluetoothModule.sendMessage(java.lang.String.format("%s %d %d", com.wanlin.androidgame.pikachuvolleyball.GameScreen.SCREEN_SIZE_KEY, com.wanlin.androidgame.pikachuvolleyball.GameScreen.screenWidth, com.wanlin.androidgame.pikachuvolleyball.GameScreen.screenHeight));
        setOtherScreenSize(((com.wanlin.androidgame.pikachuvolleyball.PikachuVolleyball) (game)).getOhterScreenWidth(), ((com.wanlin.androidgame.pikachuvolleyball.PikachuVolleyball) (game)).getOtherScreenHeight());
        otherSizeIsSet = true;
    }
    if ((touchEvents.size()) > 0) {
        stargGame();
        bluetoothModule.sendMessage(java.lang.String.valueOf(com.wanlin.androidgame.pikachuvolleyball.GameScreen.START_THAT_FUKING_GAMEEEE));
    }
}