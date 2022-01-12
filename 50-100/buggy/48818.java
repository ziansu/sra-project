@java.lang.Override
public void changed(io.github.teamfractal.actors.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    if ((textField.getText().length()) > 0) {
        newPlayerNames.add(textField.getText());
    }
    textField.setText("");
    UpdatePlayerTable();
    if ((newPlayerNames.size()) < 4) {
        newPlayerNames.add(textField.getText());
        textField.setText("");
        UpdatePlayerTable();
    }
}