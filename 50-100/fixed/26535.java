@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getSupportLoaderManager().initLoader(internetofeveryone.ioe.Chat.ChatActivity.LOADER_ID, null, this);
    icepick.Icepick.restoreInstanceState(this, savedInstanceState);
    setContentView(R.layout.activity_chat);
    userCode = getIntent().getStringExtra("contactUserCode");
    encryption = ((android.widget.ToggleButton) (findViewById(R.id.button_encryption)));
}