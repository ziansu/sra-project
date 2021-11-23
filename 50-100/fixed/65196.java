public void closeDialog() {
    dialog.setVisible(false);
    if ((getScreen()) instanceof com.toyknight.aeii.StageScreen) {
        Gdx.input.setInputProcessor(((com.toyknight.aeii.StageScreen) (getScreen())));
    }
    if ((dialog_callback) != null) {
        dialog_callback.doCallback();
        dialog_callback = null;
    }
}