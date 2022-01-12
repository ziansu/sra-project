@java.lang.Override
public void onSocketClose(java.lang.Void nil) {
    if (!(activeClosed)) {
        if ((netRequestHandlerList) != null) {
            for (com.ivxg.game.agent.INetRequestHandler handler : netRequestHandlerList) {
                try {
                    handler.close();
                } catch (java.lang.Throwable e) {
                    com.ivxg.gate.DefaultClientAgent.logger.error("ClientCloseError!", e);
                }
            }
        }
    }
}