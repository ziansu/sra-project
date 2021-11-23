public void updateSuggestions(urgenda.util.SuggestFeedback retrieveSuggestions) {
    java.lang.System.out.println("update suggestions");
    _currSuggestions = retrieveSuggestions;
    if (_currSuggestions.isCommand()) {
        commandWordText.setText(_currSuggestions.getCurrCmd());
    }else {
        commandWordText.setText("");
    }
}