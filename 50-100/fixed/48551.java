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
}