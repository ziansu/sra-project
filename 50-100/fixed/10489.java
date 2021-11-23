public void click_deleteButton(android.view.View v) {
    for (int position : win.successlvchao.android.moneypocket.MainActivity.checkedIndexList.keySet()) {
        mCostBeanList.remove(position);
        mDatabaseHelper.deleteSpecificItem(win.successlvchao.android.moneypocket.MainActivity.checkedIndexList.get(position));
    }
    win.successlvchao.android.moneypocket.MainActivity.checkedIndexList.clear();
    win.successlvchao.android.moneypocket.MainActivity.checkBoxList.clear();
    mAdapter.notifyDataSetChanged();
    findViewById(R.id.deleteButton).setVisibility(View.INVISIBLE);
    findViewById(R.id.cancelButton).setVisibility(View.INVISIBLE);
}