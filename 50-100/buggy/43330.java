public static void setupRipple(android.view.View view, boolean setClickable, boolean boundary) {
    if (setClickable) {
        view.setClickable(true);
    }
    int[] attrs = new int[]{ boundary ? R.attr.selectableItemBackgroundBorderless : R.attr.selectableItemBackground };
    android.content.res.TypedArray typedArray = view.getContext().obtainStyledAttributes(attrs);
    try {
        int backgroundResource = typedArray.getResourceId(0, 0);
        view.setBackgroundResource(backgroundResource);
    } finally {
        typedArray.recycle();
    }
}