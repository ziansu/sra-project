private void handleButtonUp(com.rougeprogrammers.shootthecat.stages.MenuStage.ButtonType type) {
    Gdx.app.log(TAG, (type + " button up"));
    switch (type) {
        case PLAY :
            screen.fadeIn();
            break;
        case SETTING :
            break;
        case EXIT :
            Gdx.app.exit();
            break;
        default :
            break;
    }
}