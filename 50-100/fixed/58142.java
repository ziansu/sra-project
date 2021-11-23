@java.lang.Override
public void onDetach() {
    super.onDetach();
    if (com.ncatz.babyguard.Babyguard_Application.isTeacher()) {
        ((android.view.ViewGroup) (expandableDate.getParent())).removeView(expandableDate);
    }
    ((com.ncatz.babyguard.Babyguard_Application) (context.getApplicationContext())).removeCalendarListener();
}