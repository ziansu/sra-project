@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    initMapYandex(savedInstanceState);
    initBottomSheet();
    getMyLocation = new com.vladikavkaz.taxi.taxivladikavkaz.GetMyLocation(this);
    mapController.addMapListener(this);
    nextButton.setOnClickListener(this);
    relative_from.setOnTouchListener(this);
    relative_to.setOnTouchListener(this);
    findMeImage.setOnClickListener(this);
}