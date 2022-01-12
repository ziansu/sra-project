public void cancelReplace(java.lang.String entryId) {
    com.kaltura.media.server.managers.KalturaLiveManager.logger.info("Cancel replacement is required");
    com.kaltura.client.types.KalturaLiveEntry liveEntry = get(entryId);
    com.kaltura.client.KalturaClient impersonateClient = impersonate(liveEntry.partnerId);
    try {
        if (((liveEntry.recordedEntryId) != null) && ((liveEntry.recordedEntryId.length()) > 0)) {
            impersonateClient.getMediaService().cancelReplace(liveEntry.recordedEntryId);
        }
    } catch (java.lang.Exception e) {
        com.kaltura.media.server.managers.KalturaLiveManager.logger.error(("Error occured: " + (e.getMessage())));
    }
}