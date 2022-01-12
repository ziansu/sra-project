@java.lang.Override
public java.lang.String getGender() {
    int id = radioGroup_Gender.getCheckedRadioButtonId();
    android.widget.RadioButton sex = ((android.widget.RadioButton) (findViewById(id)));
    if (sex == null)
        return "";
    else
        return sex.getText().toString();
    
}