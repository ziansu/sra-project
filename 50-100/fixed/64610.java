@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((com.rukiasoft.githubfetcher.GithubFetcherApplication) (getApplication())).getGithubFetcherComponent().getDetailsActivityComponent(new com.rukiasoft.githubfetcher.injection.modules.DetailsActivityModule()).inject(this);
    mBinding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_details);
    setToolbar(mBinding.detailsToolbar, true);
    mObserver.registerActivity(this);
    presenter.setName(getIntent().getStringExtra(GithubFetcherConstants.NICKNAME));
}