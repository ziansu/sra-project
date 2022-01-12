@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    viewModel = new johnsmith.haruhi.co.refrigerator.MainActivity.MainActivityViewModel(this);
    binding.setViewModel(viewModel);
    setRecyclerView();
    viewModel.onViewCreate();
}