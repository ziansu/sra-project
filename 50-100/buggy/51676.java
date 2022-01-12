private void init() {
    setContentView(getLayoutId());
    butterknife.ButterKnife.bind(this);
    validator = new com.mobsandgeeks.saripaar.Validator(this);
    validator.setValidationListener(this);
    setSupportActionBar(toolbar);
    android.os.Bundle extras = getIntent().getExtras();
    if (extras.containsKey(Constants.KEY_MODE)) {
        mode = yanovski.master_thesis.ui.utils.UIModes.valueOf(extras.getString(Constants.KEY_MODE));
    }
}