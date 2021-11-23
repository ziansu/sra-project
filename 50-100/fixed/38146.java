private void safeBottomView() {
    com.daimajia.swipe.SwipeLayout.Status status = getOpenStatus();
    android.view.ViewGroup bottom = getBottomView();
    if (status == (com.daimajia.swipe.SwipeLayout.Status.Close)) {
    }else {
        if ((bottom.getVisibility()) != (VISIBLE))
            bottom.setVisibility(com.daimajia.swipe.VISIBLE);
        
    }
}