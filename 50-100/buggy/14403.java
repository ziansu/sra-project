@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.base);
    initMenu();
    goNext();
    android.content.Intent i = this.getIntent();
    gebruiker = ((nl.cowboysenindiana.app.model.User) (i.getSerializableExtra("user")));
    android.util.Log.d("username ", gebruiker.getUsername());
}