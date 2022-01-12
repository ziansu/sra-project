@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    buttonCloseTv = ((android.widget.Button) (findViewById(R.id.close_tv)));
    buttonCloseTv.setOnClickListener(new cn.jamesli.example.at93roboguicetest.view.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            textViewStatus.setText("Closed");
        }
    });
    textViewStatus = ((android.widget.TextView) (findViewById(R.id.tv_status)));
    textViewStatus.setOnClickListener(new cn.jamesli.example.at93roboguicetest.view.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            textViewStatus.setText("Open");
        }
    });
}