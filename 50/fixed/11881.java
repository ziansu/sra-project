public java.lang.String getPreviousInput() {
    if (((main.ui.InputHistory.history.size()) > 0) && ((main.ui.InputHistory.pointer) > 0)) {
        main.ui.InputHistory.pointer -= 1;
        return main.ui.InputHistory.history.get(main.ui.InputHistory.pointer);
    }
    return null;
}