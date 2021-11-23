@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    int selected = ((android.widget.RadioGroup) (findViewById(R.id.createMatchRadioGroupArea))).getCheckedRadioButtonId();
    if (selected == (R.id.createMatchRadioButtonNorth)) {
        radioGroupAreaSelection = com.example.nickozoulis.teamproj.domain.Area.NORTH;
    }else
        if (selected == (R.id.createMatchRadioButtonCentral)) {
            radioGroupAreaSelection = com.example.nickozoulis.teamproj.domain.Area.CENTRAL;
        }else
            if (selected == (R.id.createMatchRadioButtonSouth)) {
                radioGroupAreaSelection = com.example.nickozoulis.teamproj.domain.Area.SOUTH;
            }
        
    
    filterAndRefresh(radioGroupAreaSelection);
}