public java.lang.String getNextInput() {
    if (((main.ui.InputHistory.history.size()) > 0) && ((main.ui.InputHistory.pointer) < ((main.ui.InputHistory.history.size()) - 1))) {
        main.ui.InputHistory.pointer += 1;
    }
    return main.ui.InputHistory.history.get(main.ui.InputHistory.pointer);
}