@java.lang.Override
public void onPositiveButtonClicked() {
    net.somethingdreadful.MAL.account.AccountService.clearData(true);
    startActivity(new android.content.Intent(this, net.somethingdreadful.MAL.FirstTimeInit.class));
    finish();
}