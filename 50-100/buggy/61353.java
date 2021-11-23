@java.lang.Override
public void destroy() {
    if ((currentResampledSample) != null) {
        try {
            sampleCachingService.unregisterCacheClientForFile(currentResampledSample.getSampleCacheClient());
        } catch (uk.co.modularaudio.util.exception.RecordNotFoundException | uk.co.modularaudio.util.exception.DatastoreException e) {
            final java.lang.String msg = "Exception caught cleaning up sample cache client: " + (e.toString());
            uk.co.modularaudio.mads.base.soundfile_player.ui.SoundfilePlayerMadUiInstance.log.error(msg, e);
        }
    }
}