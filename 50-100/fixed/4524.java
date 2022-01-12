@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    overlay = ((android.widget.RelativeLayout) (findViewById(R.id.overlay)));
    db = ((com.group_seven.csc413.finalprojectrepository.Global) (this.getApplication())).getDatabaseContext();
    overlay.setVisibility(View.GONE);
    setUpMapIfNeeded();
}