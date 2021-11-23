@java.lang.Override
public void onClick(android.view.View v) {
    long st = java.lang.System.currentTimeMillis();
    com.compilesense.liuyi.mcldroid.mcldroid.MCLdroidNet.getInstance().setUpNet(this);
    st = java.lang.System.currentTimeMillis();
    com.compilesense.liuyi.mcldroid.mcldroid.MCLdroidNet.getInstance().testInputBitmap(bmp);
    android.util.Log.d("MainActivity", ("计算时(ms):" + ((java.lang.System.currentTimeMillis()) - st)));
    bt.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            imageView.setImageBitmap(bmp);
        }
    }, 1000);
}