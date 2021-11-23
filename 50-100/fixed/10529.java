@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    int selected = ((android.widget.RadioGroup) (findViewById(R.id.createMatchRadioGroupLevel))).getCheckedRadioButtonId();
    if (selected == (R.id.createMatchRadioButtonJunior)) {
        radioGroupLevelSelection = 1;
    }else
        if (selected == (R.id.createMatchRadioButtonSenior)) {
            radioGroupLevelSelection = 2;
        }
    
    filterAndRefresh(radioGroupLevelSelection);
}