private void checkEmpty() {
    if (((adapter) == null) || ((adapter.getItemCount()) == 0)) {
        emptyView.setVisibility(View.VISIBLE);
        listView.setVisibility(View.GONE);
    }else {
        emptyView.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);
    }
}