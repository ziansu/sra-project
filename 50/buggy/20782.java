@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.uramonk.androidtemplateapp.databinding.ActivityMainBinding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    com.uramonk.androidtemplateapp.viewmodel.MainViewModel mainViewModel = new com.uramonk.androidtemplateapp.viewmodel.MainViewModel(this);
    binding.setMainViewModel(mainViewModel);
}