@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Boolean> observable, java.lang.Boolean oldValue, java.lang.Boolean newValue) {
    if (newValue) {
        if (!(getChildren().contains(closeButton))) {
            getChildren().add(closeButton);
        }
    }else {
        getChildren().removeIf(( c) -> c.equals(closeButton));
    }
}