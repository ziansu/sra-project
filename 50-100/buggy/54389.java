@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_take_note);
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(mToolbar);
    mRealm = io.realm.Realm.getDefaultInstance();
    mEditText = ((android.widget.EditText) (findViewById(R.id.edit_text)));
    noteText = mEditText.getText().toString();
}