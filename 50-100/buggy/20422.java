@java.lang.Override
public void start(com.google.gwt.user.client.ui.AcceptsOneWidget containerWidget, com.google.gwt.event.shared.EventBus eventBus) {
    com.architecture.client.ui.account.SignInView signInView = this.clientFactory.getSignInView();
    signInView.setAccountToSignIn(account);
    signInView.setActivity(this);
    containerWidget.setWidget(signInView.asWidget());
    removeLoader();
}