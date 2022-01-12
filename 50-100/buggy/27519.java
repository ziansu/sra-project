protected void updateListAdapter(java.util.ArrayList<com.palprotech.ensyfi.bean.student.viewlist.FeeStatus> feeStatusArrayList) {
    this.feeStatusArrayList.addAll(feeStatusArrayList);
    if ((feeStatusListAdapter) != null) {
        feeStatusListAdapter = new com.palprotech.ensyfi.adapter.studentmodule.FeeStatusListAdapter(this, this.feeStatusArrayList);
        loadMoreListView.setAdapter(feeStatusListAdapter);
    }else {
        feeStatusListAdapter.notifyDataSetChanged();
    }
}