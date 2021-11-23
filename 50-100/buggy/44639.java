@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    org.smartregister.commonregistry.CommonPersonObject personinlist = commonRepository.readAllcommonforCursorAdapter(cursor);
    org.smartregister.commonregistry.CommonPersonObjectClient pClient = new org.smartregister.commonregistry.CommonPersonObjectClient(personinlist.getCaseId(), personinlist.getDetails(), personinlist.getDetails().get("FWHOHFNAME"));
    pClient.setColumnmaps(personinlist.getColumnmaps());
    listItemProvider.getView(pClient, view);
}