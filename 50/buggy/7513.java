private void initDbHelper() {
    mDbHelper = new com.example.framgia.hrm_10.controller.database.DBHelper(this);
    mDbHelper.createAccount();
    mDbHelper.createDbStaff();
    mDbHelper.createDbStatus();
    mDbHelper.createDbDepartment();
}