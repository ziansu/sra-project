@java.lang.Override
public void refreshScreen() {
    new com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeItemsFragment.LoadInformation().execute(mUsername);
}