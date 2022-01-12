@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parentView, android.view.View selectedItemView, int position, long id) {
    java.lang.String[] userName = userSpinner.getSelectedItem().toString().split(" ");
    com.iutbmteprow.shootingarchery.dbman.Utilisateur curUser = db.getUtilisateurFromName(userName[0], userName[1]);
    idUserSelected = curUser.getId();
    ListArcFragments(curUser.getId());
}