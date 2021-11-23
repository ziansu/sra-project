@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    switch (checkedId) {
        case R.id.NormalRB :
            LifeYear = 1;
            LifeDay = 15;
            break;
        case R.id.BodyRB :
            LifeYear = 1;
            break;
        case R.id.ResearchRB :
            LifeYear = 3;
            break;
    }
    FirstSms.setSmsLifeDay(LifeYear, LifeDay);
    FirstSms.setSmsOutTime();
}