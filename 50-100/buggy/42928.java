public android.graphics.Rect getMarginRect(android.view.View header) {
    android.graphics.Rect rect = new android.graphics.Rect();
    if ((header.getLayoutParams()) instanceof android.view.ViewGroup.MarginLayoutParams) {
        initMarginRect(rect, ((android.view.ViewGroup.MarginLayoutParams) (header.getLayoutParams())));
    }else {
        rect.set(0, 0, 0, 0);
    }
    return rect;
}