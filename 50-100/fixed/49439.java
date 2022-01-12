@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    super.onScrollStateChanged(recyclerView, newState);
    if (newState == (android.support.v7.widget.RecyclerView.SCROLL_STATE_DRAGGING)) {
        fadeIn(fabMenu, cz.cvut.fel.memorice.view.activities.EntityViewActivity.FAB_ANIMATION_OFFSET);
        if (fabHideThread.isAlive()) {
            fabHideThread.interrupt();
        }
    }else
        if (newState == (android.support.v7.widget.RecyclerView.SCROLL_STATE_IDLE)) {
            prepareFABHideThread();
            fabHideThread.start();
        }
    
}