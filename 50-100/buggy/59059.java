private void showUpdateViews() {
    switch (mTypeDataRecyclerViewAdapter) {
        case com.example.framgia.hrm_10.controller.recyclerviewdata.DataRecyclerViewAdapter.TYPE_DEPARTMENT :
            mDepartmentsList.clear();
            mDepartmentsList.addAll(mDbHelper.getDbDepartment().getAllDepartments());
            break;
        case com.example.framgia.hrm_10.controller.recyclerviewdata.DataRecyclerViewAdapter.TYPE_STAFF :
            mStaffList.clear();
            mStaffList.addAll(mDbHelper.getDbStaff().getListStaffbyIdDepartment(Settings.START_INDEX_DEFAULT, mIdDepartment, EndlessRecyclerViewScrollListener.STAFF_PER_PAGE));
            getListStaff(Settings.START_INDEX_DEFAULT);
            break;
    }
    mAdapterRecyclerView.notifyDataSetChanged();
}