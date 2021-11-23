private synchronized void moveToUpdating() {
    updating = new com.watabou.utils.Rect(updated);
    updated.setEmpty();
}