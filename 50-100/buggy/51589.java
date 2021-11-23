@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_activity);
    getActivityComponent().inject(this);
    setUnBinder(butterknife.ButterKnife.bind(this));
    presenter.onAttach(this);
    userEditText.addTextChangedListener(new com.jugarte.gourmet.utils.FourDigitCardFormatWatcher());
}