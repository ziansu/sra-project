@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mQuery = query.trim();
    new com.framgia.nguyen.hrm_6.ui.activities.DepartmentDetailActivity.SearchEmployeeTask(mQuery).execute();
    return true;
}