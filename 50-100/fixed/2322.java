@java.lang.Override
public void load(me.jamiethompson.forgeaccount.Data.ForgeAccount account) {
    mLoaded = true;
    this.account = account;
    this.emailMessages = new java.util.ArrayList<>();
    emailList.setAdapter(null);
    me.jamiethompson.forgeaccount.TabActivity.GeneratorFragment.setListViewHeightBasedOnChildren(emailList);
    if (isNetworkAvailable()) {
        generator.setEmailAddress(account.getEmail());
        showAddressProgress();
    }
    me.jamiethompson.forgeaccount.Files.CurrentManager.updateCurrentAccount(this.account, me.jamiethompson.forgeaccount.TabActivity.GeneratorFragment.context);
    displayAccount();
    me.jamiethompson.forgeaccount.UI.Feedback.displayMessage(getString(R.string.message_account_loaded), view);
}