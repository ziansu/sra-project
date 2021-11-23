private void fillList() {
    db = new com.example.ctmy.sueldos.sqlitehelper.DatabaseHelper(getApplicationContext());
    com.example.ctmy.sueldos.sqlitemodel.Employee emp1 = new com.example.ctmy.sueldos.sqlitemodel.Employee(("Rolando" + ((com.example.ctmy.sueldos.employee_list.testId)++)), 4000.66, "");
    db.createEmployee(emp1);
    allEmployees = db.getAllEmployees();
    db.close();
    adapt = new com.example.ctmy.sueldos.CustomAdapter(this, allEmployees, com.example.ctmy.sueldos.employee_list.arrowImage);
    lv.setAdapter(adapt);
    registerForContextMenu(lv);
    adapt.notifyDataSetChanged();
}