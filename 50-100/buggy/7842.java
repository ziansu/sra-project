public void onResponse(de.elanev.studip.android.app.backend.datamodel.ContactGroups response) {
    try {
        if (!(favoritesGroupExisting(response))) {
            createFavoritesGroup();
        }else {
            resolver.applyBatch(AbstractContract.CONTENT_AUTHORITY, new de.elanev.studip.android.app.backend.net.sync.ContactGroupsHandler(response).parse());
        }
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    } catch (android.content.OperationApplicationException e) {
        e.printStackTrace();
    }
}