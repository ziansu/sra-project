@java.lang.Override
public com.zuluft.autoadapter.listeners.ItemInfo call(com.zuluft.autoadapter.renderables.AutoViewHolder autoViewHolder) {
    int position = autoViewHolder.getAdapterPosition();
    return new com.zuluft.autoadapter.listeners.ItemInfo(position, mAdapterDataStructure.get(position), autoViewHolder);
}