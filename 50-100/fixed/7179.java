@java.lang.Override
public void onBackPressed() {
    android.support.v4.app.Fragment fm = getSupportFragmentManager().findFragmentById(R.id.frame_container);
    if (fm instanceof com.lucazanrosso.anguriara.CalendarFragment)
        finish();
    else
        if (!(fm instanceof com.lucazanrosso.anguriara.DayFragment))
            getSupportFragmentManager().popBackStack("secondary", FragmentManager.POP_BACK_STACK_INCLUSIVE);
        else
            getSupportFragmentManager().popBackStack();
        
    
}