@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_show_article);
    idArticle = getIntent().getIntExtra(com.example.alex.pluggedin.ID, 0);
    if ((idArticle) == 0) {
        finish();
    }
    initToolBar(R.id.toolbarShowArticle);
    initFragment(savedInstanceState);
}