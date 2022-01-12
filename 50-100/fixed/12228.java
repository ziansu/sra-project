public boolean keyboardMashChecker(java.lang.String currentInput) {
    boolean hasMash = false;
    if ((((currentInput.toLowerCase().contains("sdf")) || (currentInput.toLowerCase().contains("dfg"))) || (currentInput.toLowerCase().contains("cvb"))) || (currentInput.toLowerCase().contains(",./"))) {
        hasMash = true;
    }
    return hasMash;
}