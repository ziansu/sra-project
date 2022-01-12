public void returnFlagText(java.lang.String input) {
    java.lang.String[] flagTextSplitted = input.split(";");
    setFlag(flagTextSplitted[0]);
    setText(flagTextSplitted[1]);
    for (int i = 1; i < (flagTextSplitted.length); i++) {
        setText(((getText()) + (flagTextSplitted[i])));
    }
}