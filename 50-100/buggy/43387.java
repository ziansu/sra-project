@java.lang.Override
public info.hellovass.hv_tea.adapter.recyclerview.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    info.hellovass.hv_tea.adapter.recyclerview.base.ItemViewDelegate<T> itemViewDelegate = mItemViewDelegateManager.getItemViewDelegate(viewType);
    int layoutResId = itemViewDelegate.provideItemViewLayoutResId();
    info.hellovass.hv_tea.adapter.recyclerview.ViewHolder holder = info.hellovass.hv_tea.adapter.recyclerview.ViewHolder.create(mContext, parent, layoutResId);
    onViewHolderCreated(holder, holder.getConvertView());
    setListener(parent, holder, viewType);
    return holder;
}