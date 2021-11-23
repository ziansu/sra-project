private void checkEmpty() {
    if ((adapter.getItemCount()) == 0) {
        emptyView.setVisibility(View.VISIBLE);
        listView.setVisibility(View.GONE);
    }else {
        emptyView.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);
    }
}