@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View arg1, int arg2, long arg3) {
    if (com.mk4droid.IMC_Activities.Fragment_NewIssueA.flagStarter) {
        com.mk4droid.IMC_Activities.Fragment_NewIssueA.flagStarter = false;
    }else {
        com.mk4droid.IMC_Activities.Fragment_NewIssueA.spPosition = arg2;
    }
}