@java.lang.Override
public void replaceText(int start, int end, java.lang.String text) {
    if (validate(text)) {
        replaceSelection(text);
    }
}