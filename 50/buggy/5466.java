@java.lang.Override
public void onNext(com.meisolsson.githubsdk.model.User user) {
    super.onNext(user);
    if (!(com.github.pockethub.android.accounts.AccountUtils.isUser(getActivity(), user)))
        startActivity(com.github.pockethub.android.ui.user.UserViewActivity.createIntent(user));
    
}