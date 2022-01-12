@java.lang.Override
public void showClientIdentifiers(java.util.List<com.mifos.objects.noncore.Identifier> identifiers) {
    if ((getActivity()) == null)
        return ;
    
    if ((identifiers != null) && ((identifiers.size()) > 0)) {
        com.mifos.mifosxdroid.adapters.IdentifierListAdapter identifierListAdapter = new com.mifos.mifosxdroid.adapters.IdentifierListAdapter(getActivity(), identifiers, clientId);
        lv_identifiers.setAdapter(identifierListAdapter);
    }else {
        android.widget.Toast.makeText(getActivity(), getString(R.string.message_no_identifiers_available), Toast.LENGTH_SHORT).show();
    }
}