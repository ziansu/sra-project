@java.lang.Override
public void onSessionStop(io.tetrapod.core.Session ses) {
    onEntityDisconnected(ses);
}