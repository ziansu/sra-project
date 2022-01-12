private void addNote(java.lang.String text) {
    android.widget.EditText et = new android.widget.EditText(this);
    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    layoutParams.setMargins(0, 10, 0, 0);
    et.setLayoutParams(layoutParams);
    if (text != null) {
        et.setText(text);
    }
    et.setHint(R.string.layout_editor_notehint);
    layout_notelist.add(et);
    layout_notecontainer.addView(et);
}