public void setSwipeToDismissCallback(com.marshalchen.ultimaterecyclerview.SwipeToDismissTouchListener.DismissCallbacks dismissCallbacks) {
    int[] notToDismiss = null;
    if ((mAdapter.getCustomHeaderView()) != null) {
        notToDismiss = new int[]{ 0 };
    }
    mRecyclerView.addOnItemTouchListener(new com.marshalchen.ultimaterecyclerview.SwipeToDismissTouchListener(mRecyclerView, dismissCallbacks, notToDismiss));
}