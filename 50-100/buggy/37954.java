protected void setItemAnimator(android.support.v7.widget.RecyclerView mList) {
    android.support.v7.widget.RecyclerView.ItemAnimator itemAnimator = createItemAnimator();
    int itemAnimatorDuration = getItemAnimatorDuration();
    if (itemAnimator != null) {
        itemAnimator.setAddDuration(itemAnimatorDuration);
        itemAnimator.setChangeDuration(itemAnimatorDuration);
        itemAnimator.setMoveDuration(itemAnimatorDuration);
        itemAnimator.setRemoveDuration(itemAnimatorDuration);
        mList.setItemAnimator(itemAnimator);
    }
}