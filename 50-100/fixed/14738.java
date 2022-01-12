@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_layout);
    context = this;
    searchButton = ((android.widget.Button) (findViewById(R.id.buttonSerch)));
    searchButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent intent = new android.content.Intent(context, com.shostakovsky.gitsample.CommitsActivity.class);
            startActivity(intent);
        }
    });
}