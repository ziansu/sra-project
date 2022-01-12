public int recycleItems(android.widget.LinearLayout layout, int firstItem, kankan.wheel.widget.ItemsRange range) {
    int index = firstItem;
    for (int i = 0; i < (layout.getChildCount());) {
        if (!(range.contains(index))) {
            recycleView(layout.getChildAt(i), index);
            layout.removeViewAt(i);
            if (i == 0) {
                firstItem++;
            }
        }else {
            i++;
        }
        index++;
    }
    return firstItem;
}