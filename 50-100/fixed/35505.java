@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((firstName.getText().toString().isEmpty()) && (lastName.getText().toString().isEmpty())) {
        first = "Chuck";
        last = "Norris";
    }else {
        first = firstName.getText().toString();
        last = lastName.getText().toString();
    }
}