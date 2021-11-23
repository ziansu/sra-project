@java.lang.Override
public void onSuccess(java.lang.Void info) {
    if ((emails.size()) != 0) {
        inviteEmails(emails.iterator());
    }else {
        mDefaultCallBack.onSuccess(null);
    }
}