private synchronized void enterTextNoAdditionalMarkup(java.util.List<java.lang.String> textIn) {
    model.Globals.log("In enterTextNoAdditionalMarkup");
    java.lang.String text = "";
    for (java.lang.String s : textIn) {
        text += s;
        text += '\n';
    }
    model.Globals.log("got here");
    logOutputField.setText(text);
}