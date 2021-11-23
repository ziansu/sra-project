public void removeEnterKey() {
    unw.shell.ui.ShellUIController shellController = this;
    org.eclipse.swt.custom.StyledText shellArea = shellController.getTextArea();
    int caretPosition = shellArea.getCaretOffset();
    int enterOffsetNum = (enterOffset) + 1;
    shellArea.replaceTextRange((caretPosition - enterOffsetNum), enterOffsetNum, "");
    shellController.setCaretEndText();
}