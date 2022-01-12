@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Toggle> observable, javafx.scene.control.Toggle oldValue, javafx.scene.control.Toggle newValue) {
    if ((toggleGroup.getSelectedToggle()) != null) {
        if (newValue.getUserData().equals("4")) {
            centerOuterPane.toggleActiveMode(6);
        }else
            if (newValue.getUserData().equals("6")) {
                centerOuterPane.toggleActiveMode(4);
            }
        
    }
}