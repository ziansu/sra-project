@java.lang.Override
public void onScrollStateChanged(int state) {
    super.onScrollStateChanged(state);
    if (state == (android.support.v7.widget.RecyclerView.SCROLL_STATE_DRAGGING)) {
    }else
        if (state == (android.support.v7.widget.RecyclerView.SCROLL_STATE_IDLE)) {
            onScrollIdle();
        }else
            if (state == (android.support.v7.widget.RecyclerView.SCROLL_STATE_SETTLING)) {
            }
        
    
}