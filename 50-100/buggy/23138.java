private void reset() {
    com.vaadin.terminal.gwt.client.VConsole.log("location - reset called");
    if ((currentSuggestion) != null) {
        java.lang.String text = currentSuggestion.getReplacementString();
        setPromptingOff(text);
        selectedOptionKey = currentSuggestion.key;
    }else {
        if (focused) {
            com.vaadin.terminal.gwt.client.VConsole.log("location - line 1684");
            setPromptingOff("");
        }else {
            com.vaadin.terminal.gwt.client.VConsole.log("location - line 1687");
            setPromptingOn();
        }
        selectedOptionKey = null;
    }
    lastFilter = "";
    suggestionPopup.hide();
}