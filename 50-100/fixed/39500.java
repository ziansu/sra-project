@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    isRoute = true;
    if (count == 0) {
        reloadData();
    }else {
        data = location.getSearchData(s);
        adapter.clear();
        adapter.addAll(data);
        adapter.notifyDataSetChanged();
    }
}