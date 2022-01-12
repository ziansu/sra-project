@java.lang.Override
public void onClick(android.view.View view) {
    sessionManager.logout();
    dbm.signOut(sessionManager.getEmail(), sessionManager.getAuthentication());
    actionBar.show();
    setNavButtonColorSelected(journeysFab);
    updateActionBar(R.id.journeys_fab);
    visibleLayout.setVisibility(View.GONE);
    journeysLayout.setVisibility(View.VISIBLE);
    visibleLayout = journeysLayout;
    android.content.Intent gotoLogin = new android.content.Intent(this, edu.wwu.avilatstudents.journey.LoginActivity.class);
    gotoLogin.addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(gotoLogin);
}