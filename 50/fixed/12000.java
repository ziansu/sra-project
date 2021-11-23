public void recycle() {
    name.recycle();
    value.recycle();
    comment.recycle();
    path.recycle();
    domain.recycle();
    version = 0;
}