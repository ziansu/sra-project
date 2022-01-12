@java.lang.Override
public boolean onCanProcessClick(android.view.View _view) {
    switch (_view.getId()) {
        case R.id.btnAddPeriod :
            {
                com.example.admin.fragmentapp2.DataPeriod newPeriod = new com.example.admin.fragmentapp2.DataPeriod();
                dlgFragment.setPeriod(newPeriod);
                showFragment(dlgFragment);
                return false;
            }
        case R.id.btnCalendar :
            {
                showFragment(calFragment);
                return false;
            }
        case R.id.btnPeriods :
            {
                periodsFragment.refrHasPeriods();
                showFragment(periodsFragment);
                return false;
            }
        default :
            {
                return true;
            }
    }
}