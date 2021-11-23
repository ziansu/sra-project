public void removeCircle(int x, int y) {
    android.graphics.Rect toRemove = getContainingRect(x, y);
    paint.setColor(getResources().getColor(R.color.black));
    canvas.drawRect(toRemove.left, ((toRemove.top) + 1), ((toRemove.right) + 1), toRemove.bottom, paint);
    rect.remove(getContainingRectIndex(toRemove));
    playScreen.invalidate();
}