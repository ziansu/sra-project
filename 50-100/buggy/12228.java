public boolean keyboardMashChecker(java.lang.String currentInput) {
    boolean hasMash = false;
    if ((((currentInput.equals("sdf")) || (currentInput.equals("dfg"))) || (currentInput.equals("cvb"))) || (currentInput.equals(",./"))) {
        hasMash = true;
    }
    return hasMash;
}