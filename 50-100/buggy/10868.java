protected int addView(com.tonicartos.superslim.LayoutState.View child, int position, com.tonicartos.superslim.LayoutManager.Direction direction, com.tonicartos.superslim.LayoutState state) {
    int addIndex;
    if (direction == (LayoutManager.Direction.START)) {
        addIndex = 0;
    }else {
        addIndex = mLayoutManager.getChildCount();
    }
    if (child.wasCached) {
        state.decacheView(position);
    }
    mLayoutManager.addView(child.view, addIndex);
    return addIndex;
}