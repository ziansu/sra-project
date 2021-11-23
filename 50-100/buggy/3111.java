@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_create_audio_note);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    realm = sw2017.at.realm.RealmController.getInstance().getRealm();
    notesAdapter = new sw2017.at.adapters.NotesAdapter(this, this);
    noteDate = ((android.widget.TextView) (findViewById(R.id.edit_text_date_note)));
    edit_text_output = ((android.widget.TextView) (findViewById(R.id.text_view_speech_out)));
}