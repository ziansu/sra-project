@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observableValue, java.lang.String oldValue, java.lang.String newValue) {
    if (!(oldValue.equals(newValue))) {
        if (!(newValue.equals(""))) {
            int finalCost = finalCost(java.lang.Integer.parseInt(newValue));
            newCost(finalCost);
        }
    }
}