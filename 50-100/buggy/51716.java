@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    app.akeorcist.deviceinformation.utility.WindowsUtils.setStatusAndNavColor(this);
    setContentView(R.layout.activity_screen_measure);
    layoutScreenMeasurement = ((android.widget.RelativeLayout) (findViewById(R.id.layoutScreenMeasurement)));
    layoutScreenMeasurement.setOnClickListener(new android.view.View.OnClickListener() {
        public void onClick(android.view.View v) {
            if (isFullscreen) {
                clearFullscreen();
            }else {
                setFullscreen();
            }
        }
    });
    setFullscreen();
    hideActionbar();
}