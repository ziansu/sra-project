public com.mikepenz.fastadapter.adapters.ItemAdapter<Item> remove(int position) {
    if ((mOriginalItems) != null) {
        mItems.remove((position - (com.mikepenz.fastadapter.adapters.ItemAdapter.ItemFilter.getFastAdapter().getPreItemCount(position))));
        performFiltering(mConstraint);
        return this;
    }else {
        return this.remove(position);
    }
}