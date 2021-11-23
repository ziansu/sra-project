@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if ((songItemAdapter) != null) {
        songItemAdapter.getFilter().filter(s.toString());
    }
}