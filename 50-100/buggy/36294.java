@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    if ((toolbar) != null)
        setupToolbar();
    
    if ((navigationView) != null)
        setupDrawerContent();
    
    displayView(0, null);
}