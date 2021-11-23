private void loadNetWorkImage(java.lang.String imageUrl) {
    com.malin.fresco.img.ImageLoadUtil.getInstance().load(imageUrl).requestLayout(350, 350).into(mIvSimpleHttp, new com.malin.fresco.img.ImageLoaderCallback() {
        @java.lang.Override
        public void onSuccess() {
            android.widget.Toast.makeText(getApplicationContext(), "Fresco http onSuccess", Toast.LENGTH_SHORT).show();
        }

        @java.lang.Override
        public void onFailure(java.lang.String errorMsg, java.lang.Throwable throwable) {
            android.widget.Toast.makeText(getApplicationContext(), "Fresco http onFailure", Toast.LENGTH_SHORT).show();
        }
    });
}