public int getItemCountOfTypesUntil(@android.support.annotation.IntRange(from = 0)
int position, java.lang.Integer... viewTypes) {
    java.util.List<java.lang.Integer> viewTypeList = java.util.Arrays.asList(viewTypes);
    int count = 0;
    for (int i = 0; i < position; i++) {
        if (((autoMap) && (viewTypeList.contains(mItems.get(i).getLayoutRes()))) || (viewTypeList.contains(getItemViewType(i))))
            count++;
        
    }
    return count;
}