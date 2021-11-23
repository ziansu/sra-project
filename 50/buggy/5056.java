@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    android.widget.Toast.makeText(getBaseContext(), java.lang.String.valueOf(hasFocus), Toast.LENGTH_SHORT).show();
}