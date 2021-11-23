@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.setContentView(R.layout.main);
    if (savedInstanceState == null) {
        startVideoRecorder();
        mHandlerDelayStimuli.postDelayed(new java.lang.Runnable() {
            public void run() {
                launchExperiment();
            }
        }, 2000);
    }
}