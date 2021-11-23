@java.lang.Override
public void onClick(co.snagapp.android.Sms sms) {
    dataPersister.addNumberToBlockedNumbers(sms.getId());
    numbers.add(sms);
    onBackPressed();
}