@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    if (com.vibejukebox.jukebox.activities.JukeboxListOfJukeboxes.DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.JukeboxListOfJukeboxes.TAG, "onCreate - JukeboxListOfJukeboxes");
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_jukebox_list_of_jukeboxes);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}