@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main1);
    init();
    if (savedInstanceState == null)
        com.example.slava.lenta2.MainPresenter.createPresenter(getFragmentManager(), this);
    else
        com.example.slava.lenta2.MainPresenter.update(this);
    
}