@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, @android.support.annotation.IdRes
int checkedId) {
    rb = ((android.widget.RadioButton) (findViewById(checkedId)));
    gender = rb.getText().toString();
    if (gender.equals("Male")) {
        profileColor = "BLUE";
    }else {
        profileColor = "GREEN";
    }
}