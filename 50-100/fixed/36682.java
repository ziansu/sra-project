private void initialise() {
    java.util.ArrayList<com.mycompany.CMSBHelpdesk.Case> emptyC = new java.util.ArrayList<>();
    adapter = new com.mycompany.CMSBHelpdesk.MainActivity.CaseListAdapter(this, R.id.list_item, emptyC);
    casesList = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>();
    swipeLayout = ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.swipe_container)));
    swipeLayout.setOnRefreshListener(this);
    swipeLayout.setColorScheme(android.R.color.holo_orange_light, android.R.color.holo_red_light, android.R.color.black);
}