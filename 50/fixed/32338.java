public void initPointBullet(com.reisen.danmulib.factory.PointBulletFactory factory, int width, int height, android.graphics.Bitmap image) {
    this.mFactory = factory;
    this.width = width >> 1;
    this.height = height;
    this.image = image;
}