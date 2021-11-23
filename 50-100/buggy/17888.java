@java.lang.Override
public void onCreateActions(@android.support.annotation.NonNull
java.util.List<android.support.v17.leanback.widget.GuidedAction> actions, android.os.Bundle savedInstanceState) {
    addMultilineActions(actions, getString(R.string.help_password_enter), "");
    addPasswordAction(actions, cx.ring.tv.account.TVRingLinkAccountFragment.PASSWORD, getString(R.string.account_enter_password), "", "");
    addMultilineActions(actions, getString(R.string.help_pin_enter), "");
    addPasswordAction(actions, cx.ring.tv.account.TVRingLinkAccountFragment.PIN, getString(R.string.account_link_prompt_pin), "", "");
    addDisabledAction(actions, cx.ring.tv.account.TVRingLinkAccountFragment.LINK, getString(R.string.account_link_title), "");
}