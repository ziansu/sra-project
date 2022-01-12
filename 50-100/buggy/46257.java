@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_target_translation);
    if ((findViewById(R.id.fragment_container)) != null) {
        if (savedInstanceState != null) {
            return ;
        }
        mFragment = new com.door43.translationstudio.targettranslations.TargetLanguageListFragment();
        ((com.door43.translationstudio.targettranslations.TargetLanguageListFragment) (mFragment)).setArguments(getIntent().getExtras());
        getFragmentManager().beginTransaction().add(R.id.fragment_container, ((com.door43.translationstudio.targettranslations.TargetLanguageListFragment) (mFragment))).commit();
    }
}