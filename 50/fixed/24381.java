public void addFooterView(android.view.View view) {
    if ((view != null) && ((mFooterView) == null)) {
        mFooterView = view;
        mGloriousAdapter.notifyItemInserted(((mGloriousAdapter.getItemCount()) - 1));
    }
}