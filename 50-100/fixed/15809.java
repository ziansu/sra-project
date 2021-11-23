private void setChecked(int id) {
    int pos = -1;
    if ((adapter) != null) {
        for (int item : adapter.getIds()) {
            pos++;
            if (item == id) {
                getListView().setItemChecked(pos, true);
                getListView().smoothScrollToPosition(pos);
                return ;
            }
        }
        if ((getListView()) != null) {
            getListView().setItemChecked(getListView().getCheckedItemPosition(), false);
        }
    }
}