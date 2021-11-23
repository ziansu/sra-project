@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    setSupportActionBar(binding.toolbar);
    binding.webview.getSettings().setJavaScriptEnabled(true);
    showScreen(new com.justforfun.rssreader.feature.search_feed.SourceSelectorFragment());
}