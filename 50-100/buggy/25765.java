@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) throws java.lang.SecurityException {
    super.onCreate(savedInstanceState);
    com.example.tdvpr_000.camera_shit.DBManager dbman = new com.example.tdvpr_000.camera_shit.DBManager(this);
    android.database.sqlite.SQLiteDatabase db = dbman.getWritableDatabase();
    dbman.onUpgrade(db, 1, 2);
    this.setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    addCamera();
    client = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
}