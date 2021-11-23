@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.explode);
    rememberIntent(getIntent());
    final boolean isVisible = (savedInstanceState != null) && (savedInstanceState.getBoolean(uk.co.ashtonbrsc.intentexplode.Explode.INTENT_EDITED));
    showInitialIntent(isVisible);
    if ((mHistory) != null)
        mHistory.saveHistory();
    
}