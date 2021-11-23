@java.lang.Override
public void onViewAttachedToWindow(H holder) {
    if ((mInnerAdapter) != null)
        mInnerAdapter.onViewAttachedToWindow(holder);
    
    int position = holder.getLayoutPosition();
    if ((isHeaderViewPos(position)) || (isFooterViewPos(position))) {
        com.corelibs.views.recycler.WrapperUtils.setFullSpan(holder);
    }
}