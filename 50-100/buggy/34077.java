@java.lang.Override
public void changed(com.potatoes.cultivation.screens.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    java.lang.System.out.println(("Username: " + (usernameField.getText())));
    java.lang.System.out.println(("Password: " + (passwordField.getText())));
    pGame.client.login(usernameField.getText(), passwordField.getText());
    dialog.setVisible(true);
    dialog.getMsg().setText("Logging in...");
    table.setTouchable(Touchable.disabled);
}