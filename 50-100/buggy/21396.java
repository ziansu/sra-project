private void compatibleWithLayoutManager(android.support.v7.widget.RecyclerView parent) {
    if ((parent.getLayoutManager()) instanceof android.support.v7.widget.GridLayoutManager) {
        mMode = com.arjinmc.recyclerviewdecoration.RecyclerViewItemDecoration.MODE_GRID;
    }else
        if ((parent.getLayoutManager()) instanceof android.support.v7.widget.LinearLayoutManager) {
            if ((((android.support.v7.widget.LinearLayoutManager) (parent.getLayoutManager())).getOrientation()) == (android.widget.LinearLayout.HORIZONTAL)) {
                mMode = com.arjinmc.recyclerviewdecoration.RecyclerViewItemDecoration.MODE_VERTICAL;
            }else {
                mMode = com.arjinmc.recyclerviewdecoration.RecyclerViewItemDecoration.MODE_HORIZONTAL;
            }
        }
    
}