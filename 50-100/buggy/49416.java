public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent e, float x, float y) {
    Assets.clickButton.play();
    if (((loginField.getText().toString().length()) > (bg.ittalents.game.LoginScreen.CONSTANT_LENGTH_USERNAME_CHECK)) && (passwordField.getText().toString().matches(bg.ittalents.game.LoginScreen.PASSWORD_PATTERN))) {
        login();
    }else {
        labelMessage.setText("Invalid username or password.");
    }
}