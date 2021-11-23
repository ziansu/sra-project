@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    setTitle("");
    mCustomTitle = ((android.widget.TextView) (findViewById(R.id.toolbar_custom_title)));
    mCustomActionBtn = ((android.widget.ImageButton) (findViewById(R.id.toolbar_custom_imagebtn)));
    mCustomActionBtn.setOnClickListener(new com.fmtech.empf.ui.component.layout.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if (null != (mToolbarActionListener)) {
                mToolbarActionListener.onToolbarCustomActionClick();
            }
        }
    });
}