@java.lang.Override
public void refreshScreen() {
    android.util.Log.d("Hope:", "JobScreen Refreshed");
    new com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeItemsFragment.LoadInformation().execute(mUsername);
}