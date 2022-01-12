@java.lang.Override
public void highlightError(long startPosition, long endPosition) {
    if ((mCodeEditor) != null) {
        mCodeEditor.highlightError(startPosition, endPosition);
    }
}