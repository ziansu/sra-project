@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.modify_layout);
    setViewByLayout();
    java.util.List<com.example.furry_octo_waddle.sql_manager.Word_Translation> list = action.getWordFromTable(new com.example.furry_octo_waddle.sql_manager.Word_Translation(getIntent().getExtras().getInt(Word_Translation.WORD_ID), "%", "%"), Order.NULL, 1);
    if ((list.size()) > 0)
        setCurrentWord(list.get(0));
    
    writeWord();
}