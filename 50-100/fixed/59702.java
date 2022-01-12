public void pendingRemoval(int position) {
    final E item = itemList.get(position);
    if (!(itemPendingRemovalList.contains(item))) {
        itemPendingRemovalList.add(item);
        net.nemanjakovacevic.recyclerviewswipetodelete.base.BaseRecycleViewSwiped.notifyItemChanged(position);
        java.lang.Runnable pendingRemovalRunnable = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                remove(itemList.indexOf(item));
            }
        };
        handler.postDelayed(pendingRemovalRunnable, net.nemanjakovacevic.recyclerviewswipetodelete.base.BaseRecycleViewSwiped.PENDING_REMOVAL_TIMEOUT);
        pendingRunnables.put(item, pendingRemovalRunnable);
    }
}