@java.lang.Override
public void onResume() {
    super.onResume();
    if ((toolbar) == null) {
        toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.basic_toolbar_layout)));
        setSupportActionBar(toolbar);
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            bar.setCustomView(R.layout.custom_action_bar);
            bar.setDisplayHomeAsUpEnabled(true);
        }
    }
    displayCurrentStep();
}