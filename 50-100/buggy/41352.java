@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    handle = new com.app.rahul_zoldyck.MangaWolf.Mysqlhandler(this, null);
    all = new java.util.ArrayList<>();
    all = handle.getnames();
    if ((all) == null) {
        com.app.rahul_zoldyck.MangaWolf.MainActivity.firsttime f = new com.app.rahul_zoldyck.MangaWolf.MainActivity.firsttime();
        f.execute();
    }
    startActivity(new android.content.Intent(this, com.app.rahul_zoldyck.MangaWolf.OpenerActivity.class));
}