@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_boot_info);
    datePickerDialog = new android.app.DatePickerDialog(this.getActivityContext(), this, 2017, 7, 10);
    if ((mBootPresenter) == null) {
        mBootPresenter = new br.com.android.pocapp.presenter.BootPresenter(this);
    }
    mBootPresenter.list();
}