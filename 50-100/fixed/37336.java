@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if ((newValue == null) || ((newValue.length()) == 0)) {
        hidePopup();
    }else {
        filterSuggestions(newValue);
        if (!(suggestionPopup.isShowing())) {
            showPopup();
        }
    }
}