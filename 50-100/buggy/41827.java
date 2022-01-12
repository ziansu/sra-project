private java.util.ArrayList<com.rnds.DirectedScrollViewChild> getScrollableChildren() {
    android.view.ViewGroup contentContainer = ((android.view.ViewGroup) (getChildAt(0)));
    java.util.ArrayList<com.rnds.DirectedScrollViewChild> scrollableChildren = new java.util.ArrayList<>();
    for (int i = 0; i < (contentContainer.getChildCount()); i++) {
        android.view.View childView = contentContainer.getChildAt(i);
        if (childView instanceof com.rnds.DirectedScrollViewChild) {
            scrollableChildren.add(((com.rnds.DirectedScrollViewChild) (childView)));
        }
    }
    return scrollableChildren;
}