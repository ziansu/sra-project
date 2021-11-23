@java.lang.Override
public void showGroupPayloadUpdated(com.mifos.objects.group.GroupPayload groupPayload) {
    groupPayloads.set(mClientSyncIndex, groupPayload);
    mSyncGroupPayloadAdapter.notifyDataSetChanged();
    mClientSyncIndex = (mClientSyncIndex) + 1;
    if ((groupPayloads.size()) != (mClientSyncIndex)) {
        syncGroupPayload(mClientSyncIndex);
    }
}