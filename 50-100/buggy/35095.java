@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final namtran.codejavagiaithuat.SortView sortView = ((namtran.codejavagiaithuat.SortView) (findViewById(R.id.sortView)));
    sortView.setListValue(new int[]{ 5 , 6 , 2 , 2 , 10 , 12 , 9 , 99 , 9 });
    findViewById(R.id.btStartAnimation).setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            sortView.startAnimation();
        }
    });
}