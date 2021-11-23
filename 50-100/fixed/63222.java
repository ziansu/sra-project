@java.lang.Override
public void showClientPayloadUpdated(com.mifos.objects.client.ClientPayload clientPayload) {
    clientPayloads.set(mClientSyncIndex, clientPayload);
    mSyncPayloadsAdapter.notifyDataSetChanged();
    mClientSyncIndex = (mClientSyncIndex) + 1;
    if ((clientPayloads.size()) != (mClientSyncIndex)) {
        syncClientPayload();
    }
}