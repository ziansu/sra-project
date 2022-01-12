@java.lang.Override
public void onViewAttachedToWindow(H holder) {
    mInnerAdapter.onViewAttachedToWindow(holder);
    int position = holder.getLayoutPosition();
    if ((isHeaderViewPos(position)) || (isFooterViewPos(position))) {
        com.corelibs.views.recycler.WrapperUtils.setFullSpan(holder);
    }
}