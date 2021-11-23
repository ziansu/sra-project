private void updateHeaderDetails(java.lang.String name, java.lang.String title) {
    android.widget.EditText authorEditText = ((android.widget.EditText) (findViewById(R.id.author_name)));
    android.widget.EditText titleEditText = ((android.widget.EditText) (findViewById(R.id.template_title)));
    assert authorEditText != null;
    authorEditText.setText(name);
    assert titleEditText != null;
    titleEditText.setText(title);
}