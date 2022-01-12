@java.lang.Override
public void onClick(android.view.View view) {
    dateTimeFragment = com.kunzisoft.switchdatetime.SwitchDateTimeDialogFragment.newInstance(getString(R.string.label_datetime_dialog), getString(android.R.string.ok), getString(android.R.string.cancel));
    setupDatetimeFragment();
    dateTimeFragment.show(getSupportFragmentManager(), com.kunzisoft.switchdatetimesample.Sample.TAG_DATETIME_FRAGMENT);
}