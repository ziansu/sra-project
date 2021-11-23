@java.lang.Override
public void changed(javafx.beans.value.ObservableValue observable, java.lang.Object oldValue, java.lang.Object newValue) {
    soundValue.textProperty().setValue(java.lang.String.valueOf(((int) (soundBar.getValue()))));
    MainLogic.instance.getMp().setVolume(((soundBar.getValue()) / 100));
}