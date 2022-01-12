@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    ((android.widget.TextView) (findViewById(R.id.sleepTime))).setText(((android.widget.EditText) (origin.findViewById(R.id.input))).getText().toString());
    init();
    slptime = ((android.widget.EditText) (origin.findViewById(R.id.input))).getText().toString();
}