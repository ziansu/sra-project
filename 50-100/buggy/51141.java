@java.lang.Override
public void finish(org.support.project.common.bat.JobResult result) {
    org.support.project.web.bean.MessageResult message = new org.support.project.web.bean.MessageResult();
    message.setMessage(("Reindexing is ended. [status]" + (result.getResultCode())));
    try {
        session.getBasicRemote().sendText(net.arnx.jsonic.JSON.encode(message));
        session.close();
    } catch (net.arnx.jsonic.JSONException | java.io.IOException e) {
        org.support.project.knowledge.websocket.ReindexingEndpoint.LOG.warn("websocket message send error", e);
    }
}