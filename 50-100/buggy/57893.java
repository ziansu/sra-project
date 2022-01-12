@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);
    butterknife.ButterKnife.bind(this);
    setSupportActionBar(mToolbar);
    mPicasso = ivamluz.marvelshelf.MarvelShelfApplication.getInstance().getPicasso();
    mCharacter = getIntent().getParcelableExtra(ivamluz.marvelshelf.ui.activities.CharacterDetailsActivity.EXTRA_CHARACTER);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        mCharacterThumbnail.setTransitionName(getString(R.string.shared_transition_character_image));
    }
    bindCharacterInfo();
    setupCharacterDetailsFragment();
}