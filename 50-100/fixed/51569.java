@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    buttonCloseTv.setOnClickListener(new cn.jamesli.example.at93roboguicetest.view.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            textViewStatus.setText("Closed");
        }
    });
    textViewStatus.setOnClickListener(new cn.jamesli.example.at93roboguicetest.view.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            textViewStatus.setText("Open");
        }
    });
}