@java.lang.Override
public void onPreference(james.colorpickerdialog.dialogs.PreferenceDialog dialog, java.lang.Integer preference) {
    android.widget.Toast.makeText(this, java.lang.String.format("#%06X", (16777215 & preference)), Toast.LENGTH_SHORT).show();
}