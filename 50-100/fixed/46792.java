@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.d(com.srodrigo.androidhintspinner.HintSpinner.TAG, ("position selected: " + position));
    if ((this.callback) == null) {
        throw new java.lang.IllegalStateException("callback cannot be null");
    }
    if (!(isHintPosition(position))) {
        java.lang.Object item = getItemAtPosition(position);
        this.callback.onItemSelected(position, ((T) (item)));
    }
}