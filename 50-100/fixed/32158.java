@java.lang.Override
void work(java.lang.String source, android.graphics.Bitmap bitmap) {
    if (!(source.equals(self.source))) {
        return ;
    }
    shape.setBitmap(bitmap);
    if (bitmap != null) {
        self.onLoad();
    }else {
        self.onError();
    }
}