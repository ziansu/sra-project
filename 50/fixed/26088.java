private void initializeLogicSystemVariables() throws java.io.IOException, java.text.ParseException {
    updateInternalStorage();
    _undoStack = new java.util.Stack<cs2103_w09_1j.esther.State>();
}