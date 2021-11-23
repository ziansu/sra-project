@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((employeeOps) != null) {
        employeeOps.open();
    }
}