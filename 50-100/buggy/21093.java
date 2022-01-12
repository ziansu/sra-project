@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    validate(mHtmlSpinner);
    if ((mErrorMessages.size()) > 0) {
        android.widget.TextView selectedTextView = ((android.widget.TextView) (view));
        selectedTextView.setError(readableErrorMessages());
    }
}