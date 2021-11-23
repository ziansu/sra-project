@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    validate(mHtmlSpinner);
    android.widget.TextView selectedTextView = ((android.widget.TextView) (view));
    if ((mErrorMessages.size()) > 0) {
        selectedTextView.setError(readableErrorMessages());
    }else {
        selectedTextView.setError(null);
    }
}