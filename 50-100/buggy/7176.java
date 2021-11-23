@java.lang.Override
public void loadEmails(java.util.List<me.jamiethompson.forgeaccount.Data.EmailMessage> emails) {
    if (!(emails.isEmpty())) {
        emailList.setAdapter(null);
        this.emailMessages = emails;
    }
    hideEmailsProgress();
    me.jamiethompson.forgeaccount.ListView.EmailListAdapter adapter = new me.jamiethompson.forgeaccount.ListView.EmailListAdapter(getContext(), R.layout.item_email, this.emailMessages);
    emailList.setAdapter(adapter);
    me.jamiethompson.forgeaccount.TabActivity.GeneratorFragment.setListViewHeightBasedOnChildren(emailList);
}