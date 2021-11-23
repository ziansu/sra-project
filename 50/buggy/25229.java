@java.lang.Override
public void onSessionStop(io.tetrapod.core.Session ses) {
    io.tetrapod.core.TetrapodService.logger.info("Session Stopped: {}", ses);
    onEntityDisconnected(ses);
}