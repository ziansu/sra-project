public void addNewTitle(android.view.View view) {
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.edit_text)));
    java.lang.String message = editText.getText().toString();
    comingSoon.add(message);
    java.util.Collections.sort(comingSoon);
}