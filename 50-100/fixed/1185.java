@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    getTakePhoto().onCreate(savedInstanceState);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    setTitle("MSU Mobile Pill Finder");
    if ((pillClassifier) == null)
        pillClassifier = new msu.ece.xiaozeng.mpf3.classifier.PillClassifier(this);
    
}