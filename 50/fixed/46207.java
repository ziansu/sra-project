@java.lang.Override
public boolean onQueryTextChange(java.lang.String query) {
    if (query.equals("")) {
        se.chalmers.projektgrupplp4.studentlivinggbg.model.SearchHandler.createSearch("");
    }
    model.refreshAdapter();
    return false;
}