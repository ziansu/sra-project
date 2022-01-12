public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        mListJenkinsBuildInfoFragment = org.addhen.birudo.ui.fragment.ListJenkinsBuildInfoFragment.newInstance();
        if (!(mPresenter.isAppConfigured())) {
            launch.settings();
        }
        getFragmentManager().beginTransaction().replace(R.id.list_container, mListJenkinsBuildInfoFragment).commit();
    }
}