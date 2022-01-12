public void initMargins(android.graphics.Rect margins, android.view.View view) {
    android.view.ViewGroup.LayoutParams layoutParams = (view != null) ? view.getLayoutParams() : null;
    if ((layoutParams != null) && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
        initMarginRect(margins, ((android.view.ViewGroup.MarginLayoutParams) (layoutParams)));
    }else {
        margins.set(0, 0, 0, 0);
    }
}