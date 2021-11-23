@java.lang.Override
public void showPayloadDeletedAndUpdatePayloads(java.util.List<com.mifos.objects.group.GroupPayload> groups) {
    mClientSyncIndex = 0;
    groupPayloads.clear();
    this.groupPayloads = groups;
    mSyncGroupPayloadAdapter.setGroupPayload(groupPayloads);
    if ((groupPayloads.size()) != 0) {
        syncGroupPayload(mClientSyncIndex);
    }else {
        ll_error.setVisibility(View.VISIBLE);
        mNoPayloadText.setText("All Groups have been Sync");
        mNoPayloadIcon.setImageResource(R.drawable.ic_assignment_turned_in_black_24dp);
    }
}