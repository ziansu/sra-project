@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> ov, java.lang.String t, java.lang.String t1) {
    java.lang.System.out.println("Plate No. Changed");
    if ((t1 != null) && ((t1.trim()) != "")) {
        rentButton.setDisable(false);
    }else {
        rentButton.setDisable(true);
    }
}