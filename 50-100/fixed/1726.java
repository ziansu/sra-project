public void seUpRecycleview() {
    if ((adapter) == null) {
        adapter = new se.sockertoppar.timeplanner.RecyclerListAdapter(subjectsArrayList, myDatabasHelperSubjects, this, plannerListObjekt, recycleView);
        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
        android.support.v7.widget.helper.ItemTouchHelper.Callback callback = new se.sockertoppar.timeplanner.helper.SimpleItemTouchHelperCallback(adapter);
        mItemTouchHelper = new android.support.v7.widget.helper.ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(recycleView);
    }else {
        adapter.updateList(subjectsArrayList);
    }
    checkIfSubjectActiv();
}