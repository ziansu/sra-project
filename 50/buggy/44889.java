@java.lang.Override
public void onUtteranceCompleted(java.lang.String utteranceId) {
    try {
        GlobalVars.musicPlayer.setVolume(1.0F, 1.0F);
    } catch (java.lang.NullPointerException e) {
    } catch (java.lang.Exception e) {
    }
}