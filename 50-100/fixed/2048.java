private void undoOpt(com.exemple.android.cookbook.entity.CategoryRecipes item) {
    java.lang.Runnable pendingRemovalRunnable = pendingRunnables.get(item);
    pendingRunnables.remove(item);
    if (pendingRemovalRunnable != null)
        mHandler.removeCallbacks(pendingRemovalRunnable);
    
    mItemsPendingRemoval.remove(item);
    notifyItemChanged(mItems.indexOf(mItem));
}