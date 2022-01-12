public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_contact_designer);
    getTitleFromIntent(this.getIntent());
    initActionBar();
    initTabHost(this.getIntent());
    initListView();
}