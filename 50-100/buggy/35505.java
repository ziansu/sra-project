@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (firstName.getText().toString().isEmpty()) {
        first = "Chuck";
    }else {
        first = firstName.getText().toString();
    }
    if (lastName.getText().toString().isEmpty()) {
        last = "Norris";
    }else {
        last = lastName.getText().toString();
    }
}