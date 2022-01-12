@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_inbox);
    com.parse.Parse.initialize(this, "H9NFC1K9LmahxGcCrMOdT0qMaE0lDGT6BgbrSOAc", "4K2VfxRGIyk69KlQJ2B8NMnD71llrlkEPLdTNh9M");
    new com.example.ricardogarcia.politojobs.Inbox.RetrieveFromDatabase().execute("rgarcia");
}