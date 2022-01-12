@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simulator);
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setHomeButtonEnabled(true);
    getFragmentManager().beginTransaction().replace(R.id.container, new org.buildmlearn.toolkit.quiztemplate.TFTQuizFragment(), TFTQuizFragment.TAG).addToBackStack(null).commit();
}