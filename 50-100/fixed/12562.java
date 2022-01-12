@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (Category.TYPE_SUB_TITLE)) {
        return new com.fmtech.categoryrecyclerview.CategoryAdapter.CategoryTitleViewHolder(mLayoutInflater.inflate(R.layout.item_category_list_subtitle, null, false));
    }else
        if (viewType == (Category.TYPE_SUB_ITEM)) {
            return new com.fmtech.categoryrecyclerview.CategoryAdapter.CategoryItemViewHolder(mLayoutInflater.inflate(R.layout.item_category_list_subitem, null, false));
        }else {
            throw new java.lang.RuntimeException(("Invalid viewType: " + viewType));
        }
    
}