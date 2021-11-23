@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    android.widget.RadioButton rb = ((android.widget.RadioButton) (group.findViewById(checkedId)));
    if ((rb != null) && (checkedId > (-1))) {
        android.widget.Toast.makeText(getApplicationContext(), rb.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}