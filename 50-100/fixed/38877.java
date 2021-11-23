@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.level_edit_text)));
    } catch (java.lang.NumberFormatException e) {
        android.util.Log.w("Grwothbeat Sample", ("Input value error :" + (e.getMessage())));
    }
}