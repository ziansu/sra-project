@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if ((newValue.length()) == 0) {
        hidePopup();
    }else {
        if (!(suggestionPopup.isShowing())) {
            showPopup();
        }
        filterSuggestions(newValue);
    }
}