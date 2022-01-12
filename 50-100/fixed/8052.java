@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    injectDependencies(savedInstanceState);
    mBinding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_my_stocks);
    mBinding.setViewModel(mViewModel);
    checkPlayServicesAvailable();
    setupRecyclerView();
    checkAddIntent(getIntent());
    getSupportLoaderManager().initLoader(com.sam_chordas.android.stockhawk.presentation.mystocks.MyStocksActivity.CURSOR_LOADER_ID, null, this);
}