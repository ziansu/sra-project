@java.lang.Override
public void onDraw(android.graphics.Canvas c, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    android.util.Log.d(com.android.packitup.RVItemDecoration.TAG, "onDraw");
    if ((mOrientation) == (com.android.packitup.RVItemDecoration.VERTICAL_LIST)) {
        drawVertical(c, parent);
    }else {
        drawHorizontal(c, parent);
    }
}