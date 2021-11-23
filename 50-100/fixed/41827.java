private java.util.ArrayList<com.rnds.DirectedScrollViewChild> getScrollableChildren() {
    java.util.ArrayList<com.rnds.DirectedScrollViewChild> scrollableChildren = new java.util.ArrayList<>();
    for (int i = 0; i < (getChildCount()); i++) {
        android.view.View childView = getChildAt(i);
        if (childView instanceof com.rnds.DirectedScrollViewChild) {
            scrollableChildren.add(((com.rnds.DirectedScrollViewChild) (childView)));
        }
    }
    return scrollableChildren;
}