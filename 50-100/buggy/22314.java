private sg.edu.nus.comp.orbital.synchro.CardViewAdapters.CardViewUserAdapter displayUsers(android.support.v7.widget.RecyclerView recyclerView, java.lang.String query) {
    java.util.ArrayList<sg.edu.nus.comp.orbital.synchro.DataHolders.User> arrayToDisplay;
    query = "%users";
    if (query.equalsIgnoreCase("%users")) {
        arrayToDisplay = sg.edu.nus.comp.orbital.synchro.SearchResultsFragment.users;
    }else {
        com.google.gson.JsonArray result = sg.edu.nus.comp.orbital.synchro.SynchroAPI.getInstance().getSearchGroups(query);
        arrayToDisplay = sg.edu.nus.comp.orbital.synchro.DataHolders.User.parseUsers(result);
    }
    sg.edu.nus.comp.orbital.synchro.CardViewAdapters.CardViewUserAdapter userAdapter = new sg.edu.nus.comp.orbital.synchro.CardViewAdapters.CardViewUserAdapter(arrayToDisplay, getFragmentManager());
    recyclerView.setAdapter(userAdapter);
    return userAdapter;
}