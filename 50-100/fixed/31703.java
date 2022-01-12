@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.potrait_activity);
    android.content.Intent intent = getIntent();
    index = intent.getIntExtra("index", 0);
    com.android.manit.fragments.ImageViewer imageViewer = ((com.android.manit.fragments.ImageViewer) (getFragmentManager().findFragmentById(R.id.imageViewerId)));
    if (imageViewer != null)
        imageViewer.changeImage(index);
    
}