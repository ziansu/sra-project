@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mainLayout = ((android.widget.RelativeLayout) (findViewById(R.id.myLayout)));
    btnLaunch = ((android.widget.Button) (findViewById(R.id.btnLaunch)));
    btnLaunch.setOnClickListener(this);
    btnList = ((android.widget.Button) (findViewById(R.id.btnList)));
    btnList.setOnClickListener(this);
}