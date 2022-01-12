@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_image);
    android.content.Intent intent = getIntent();
    android.os.Bundle bundle = intent.getExtras();
    thenextvoyager.wallser.Data.DataModel object = ((thenextvoyager.wallser.Data.DataModel) (bundle.getSerializable(thenextvoyager.wallser.Data.Constants.MODEL_TAG)));
    thenextvoyager.wallser.fragment.ImageFragment fragment = thenextvoyager.wallser.fragment.ImageFragment.newInstance(object);
    getSupportFragmentManager().beginTransaction().add(R.id.image_frag_container, fragment, thenextvoyager.wallser.Data.Constants.IMAGE_FRAGMENT_TAG).commitAllowingStateLoss();
}