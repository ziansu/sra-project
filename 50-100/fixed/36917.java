@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    textView = ((android.widget.TextView) (findViewById(R.id.tv_path)));
    pickButton = ((android.widget.Button) (findViewById(R.id.bt_pick)));
    imageView = ((android.widget.ImageView) (findViewById(R.id.iv_image)));
    pickButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            pickImage();
        }
    });
}