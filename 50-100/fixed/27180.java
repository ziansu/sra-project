public void onViewRemoved(android.view.View child) {
    for (java.util.Map.Entry<com.daimajia.swipe.SwipeLayout.DragEdge, android.view.View> entry : new java.util.HashMap<com.daimajia.swipe.SwipeLayout.DragEdge, android.view.View>(mDragEdges).entrySet()) {
        if ((entry.getValue()) == child) {
            mDragEdges.remove(entry.getKey());
        }
    }
}