@java.lang.Override
public void showPayloadDeletedAndUpdatePayloads(java.util.List<com.mifos.objects.client.ClientPayload> clients) {
    mClientSyncIndex = 0;
    clientPayloads.clear();
    this.clientPayloads = clients;
    mSyncPayloadsAdapter.notifyDataSetChanged();
    if ((clientPayloads.size()) != 0) {
        syncClientPayload();
    }else {
        ll_error.setVisibility(View.VISIBLE);
        mNoPayloadText.setText("All Clients have been Sync");
        mNoPayloadIcon.setImageResource(R.drawable.ic_assignment_turned_in_black_24dp);
    }
}