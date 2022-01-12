@java.lang.Override
public float SendOSCMessage(java.lang.String message) {
    if (com.teotigraphix.caustk.core.CaustkEngine.DEBUG_MESSAGES) {
        android.util.Log.d(com.teotigraphix.caustk.core.generator.Caustic.TAG, ("Message: " + message));
    }
    return super.SendOSCMessage(message);
}