@java.lang.Override
public void onDetach() {
    super.onDetach();
    if (com.ncatz.babyguard.Babyguard_Application.isTeacher()) {
        ((com.ncatz.babyguard.Babyguard_Application) (context.getApplicationContext())).removeCalendarListener();
        ((android.view.ViewGroup) (expandableDate.getParent())).removeView(expandableDate);
    }
}