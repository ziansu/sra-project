@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mQuery = query;
    new com.framgia.nguyen.hrm_6.ui.activities.DepartmentDetailActivity.SearchEmployeeTask(query).execute();
    return true;
}