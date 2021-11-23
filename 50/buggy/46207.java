@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (newText.equals("")) {
        se.chalmers.projektgrupplp4.studentlivinggbg.model.SearchHandler.createSearch("");
        model.refreshAdapter();
    }
    return false;
}