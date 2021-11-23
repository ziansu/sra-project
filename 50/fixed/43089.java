@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends Game.PlayerTurn> observable, Game.PlayerTurn oldValue, Game.PlayerTurn newValue) {
    if (newValue != null)
        moveDescription.setText(newValue.getTurnString());
    
}