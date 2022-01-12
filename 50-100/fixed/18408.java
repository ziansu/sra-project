@java.lang.Override
public void onUnPublish() {
    com.kaltura.media.server.wowza.RecordingManager.logger.info((((("Stop recording: entry Id [" + (entryId)) + "], asset Id [") + (assetId)) + "]"));
    com.kaltura.client.types.KalturaLiveAsset liveAsset = liveManager.getLiveAssetById(entryId, assetId);
    if ((liveAsset != null) && (liveAsset.tags.contains("recording_anchor"))) {
        liveManager.cancelReplace(entryId);
    }
    this.stopRecording();
}