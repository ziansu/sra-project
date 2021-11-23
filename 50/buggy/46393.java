private void drawDivider(android.graphics.Canvas canvas) {
    android.util.Log.d("Divider bound", mDividerBound.toString());
    canvas.drawLine(mDividerBound.left, mDividerBound.top, mDividerBound.right, mDividerBound.bottom, mDividerPaint);
}