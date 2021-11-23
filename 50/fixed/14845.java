@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_promotions);
    repository = com.example.piromsurang.ebookk.data.RealBookRepository.getInstance();
    presenter = new com.example.piromsurang.ebookk.BookPresenter(repository, this);
    initializeListview();
}