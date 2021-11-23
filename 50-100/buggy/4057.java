@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_capture);
    indexInBound = getIntent();
    imagePath = indexInBound.getStringExtra("imagePath");
    java.io.File imageFile = new java.io.File(imagePath);
    iv_ScreenDot = ((android.widget.ImageView) (findViewById(R.id.iv_ScreenDots)));
    iv_ScreenDot.setImageURI(android.net.Uri.fromFile(imageFile));
}