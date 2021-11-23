public void recycle() {
    name.recycle();
    value.recycle();
    comment.recycle();
    maxAge = -1;
    path.recycle();
    domain.recycle();
    version = 0;
    secure = false;
}