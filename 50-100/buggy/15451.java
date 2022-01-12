@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_feed);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    settings = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    fetchNewSnapshot();
    java.util.TimerTask task = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            fetchNewSnapshot();
        }
    };
    new java.util.Timer().scheduleAtFixedRate(task, 500, 500);
}