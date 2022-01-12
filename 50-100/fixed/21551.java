private void initTitle() {
    initTitleBar(binding.titleBar, TitleBar.Type.COMMON);
    getTitleBar().setRightVisibility(View.GONE);
    getTitleBar().setTitle(getString(R.string.build_follow));
    getTitleBar().setLeftClickEvent(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            finish();
        }
    });
}