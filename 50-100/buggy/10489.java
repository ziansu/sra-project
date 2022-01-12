public void click_deleteButton(android.view.View v) {
    for (int position : win.successlvchao.android.moneypocket.MainActivity.checkedIndexList.keySet()) {
        mCostBeanList.remove(position);
        win.successlvchao.android.moneypocket.MainActivity.checkBoxList.remove(position);
        mDatabaseHelper.deleteSpecificItem(win.successlvchao.android.moneypocket.MainActivity.checkedIndexList.get(position));
    }
    mAdapter.notifyDataSetChanged();
    win.successlvchao.android.moneypocket.MainActivity.checkedIndexList.clear();
    findViewById(R.id.deleteButton).setVisibility(View.INVISIBLE);
    findViewById(R.id.cancelButton).setVisibility(View.INVISIBLE);
}