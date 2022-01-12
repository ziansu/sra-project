public void editRTFO(gameFunctions.RTFO toEdit) {
    theClass.addToChatLog("Type in new info and hit enter", "~", true);
    java.lang.String input = theClass.waitForInput();
    java.lang.String symbolTemp = toEdit.contents.substring(0, 1);
    for (java.lang.String sym : symbols) {
        if (symbolTemp.equalsIgnoreCase(sym)) {
            input = symbolTemp + input;
        }
    }
    toEdit.contents = input;
}