@java.lang.Override
public void showClientIdentifiers(java.util.List<com.mifos.objects.noncore.Identifier> identifiers) {
    if ((getActivity()) == null)
        return ;
    
    this.identifiers = identifiers;
    if ((identifiers != null) && ((identifiers.size()) > 0)) {
        identifierListAdapter = new com.mifos.mifosxdroid.adapters.IdentifierListAdapter(getActivity(), this.identifiers, clientId, this);
        lv_identifiers.setAdapter(identifierListAdapter);
    }else {
        android.widget.Toast.makeText(getActivity(), getString(R.string.message_no_identifiers_available), Toast.LENGTH_SHORT).show();
    }
}