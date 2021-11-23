private void reset() {
    if ((currentSuggestion) != null) {
        java.lang.String text = currentSuggestion.getReplacementString();
        setPromptingOff(text);
        selectedOptionKey = currentSuggestion.key;
    }else {
        if (focused) {
            setPromptingOff("");
        }else {
            setPromptingOn();
        }
        selectedOptionKey = null;
    }
    lastFilter = "";
    suggestionPopup.hide();
}