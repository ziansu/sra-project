@java.lang.Override
public void call(com.zuluft.autoadapter.listeners.ItemInfo<T, Q> tqItemInfo) {
    if (tqItemInfo != null) {
        mOnItemClickListener.onItemClicked(tqItemInfo);
    }
}