@java.lang.Override
public void onUpdateRecipientSuccess(com.silverpop.engage.UpdateRecipientResponse updateCurrentRecipientResponse) {
    final java.lang.String oldRecipientId = com.silverpop.engage.config.EngageConfig.recipientId(getContext());
    final java.lang.String newRecipientId = updateCurrentRecipientResponse.getRecipientId();
    com.silverpop.engage.config.EngageConfig.storeRecipientId(getContext(), newRecipientId);
    if (getEngageConfigManager().mergeHistoryInAuditRecordTableDatabase()) {
        updateAuditRecordWithMergeChanges(oldRecipientId, newRecipientId, identityHandler);
    }else {
        identityHandler.onSuccess(com.silverpop.engage.config.EngageConfig.recipientId(getContext()), com.silverpop.engage.config.EngageConfig.mobileUserId(getContext()));
    }
}