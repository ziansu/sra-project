@java.lang.Override
public android.graphics.Rect getItemOffsets(android.support.v7.widget.LinearLayoutManager layoutManager, int position) {
    android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
    int offset = ((int) ((getResources().getDisplayMetrics().density) * 2));
    if ((position % 3) != 2) {
        rect.right = offset;
        rect.bottom = offset;
    }
    return rect;
}