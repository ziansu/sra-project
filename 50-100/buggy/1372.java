@java.lang.Override
public com.rsen.base.RBaseViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    int itemLayoutId = getItemLayoutId(viewType);
    android.view.View item;
    if (itemLayoutId == 0) {
        item = createContentView(viewType);
        if (item == null) {
            item = createContentView(parent, viewType);
        }
    }else {
        item = android.view.LayoutInflater.from(mContext).inflate(itemLayoutId, parent, false);
    }
    return new com.rsen.base.RBaseViewHolder(item, viewType);
}