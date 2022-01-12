public void setupEqEffect(int audioSessionId) {
    android.util.Log.d(com.sloths.speedy.shortsounds.model.EqEffect.TAG, (("Attaching EQ to track id [" + audioSessionId) + "]"));
    try {
        this.effect = new android.media.audiofx.Equalizer(0, audioSessionId);
        setEffectProperties();
        this.effect.setEnabled(isActive);
        android.util.Log.d(com.sloths.speedy.shortsounds.model.EqEffect.TAG, (("Enabled [" + (effect.getEnabled())) + "]"));
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.sloths.speedy.shortsounds.model.EqEffect.TAG, "Error creating the Equalizer");
        e.printStackTrace();
    }
}