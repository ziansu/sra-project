public void addFooterView(android.view.View view) {
    mFooterView = view;
    mGloriousAdapter.notifyItemInserted(((mGloriousAdapter.getItemCount()) - 1));
}