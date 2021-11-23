protected void setItemAnimator(android.support.v7.widget.RecyclerView mList) {
    android.support.v7.widget.RecyclerView.ItemAnimator itemAnimator = createItemAnimator();
    if (itemAnimator != null) {
        int itemAnimatorDuration = getItemAnimatorDuration();
        itemAnimator.setAddDuration(itemAnimatorDuration);
        itemAnimator.setChangeDuration(itemAnimatorDuration);
        itemAnimator.setMoveDuration(itemAnimatorDuration);
        itemAnimator.setRemoveDuration(itemAnimatorDuration);
        mList.setItemAnimator(itemAnimator);
    }
}