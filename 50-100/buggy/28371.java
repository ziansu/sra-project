public void removeEnterKey() {
    unw.shell.ui.ShellUIController shellController = this;
    org.eclipse.swt.custom.StyledText shellArea = shellController.getTextArea();
    int caretPosition = shellArea.getCaretOffset();
    int enterOffsetNum = (enterOffset) + 1;
    java.lang.String saveString = shellArea.getTextRange((caretPosition - enterOffsetNum), enterOffsetNum);
    shellArea.replaceTextRange((caretPosition - enterOffsetNum), enterOffsetNum, "");
    shellController.setCaretEndText();
    shellTextArea.append(saveString);
}