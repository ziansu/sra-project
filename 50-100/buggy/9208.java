private void displayListView() {
    getInfo.refreshData();
    java.util.List<com.util.Employee> EmployeeList;
    EmployeeList = getInfo.currentPojo.getAllEmployees();
    dataAdapter = new com.service.SendMSM.MyCustomAdapter(this, R.layout.employee_info, EmployeeList);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.listView1)));
    listView.setAdapter(dataAdapter);
}