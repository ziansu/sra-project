@java.lang.Override
public com.zuluft.autoadapter.listeners.ItemInfo call(com.zuluft.autoadapter.renderables.AutoViewHolder autoViewHolder) {
    int position = autoViewHolder.getAdapterPosition();
    return position != (-1) ? new com.zuluft.autoadapter.listeners.ItemInfo(position, mAdapterDataStructure.get(position), autoViewHolder) : null;
}