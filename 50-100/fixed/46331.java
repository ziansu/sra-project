@java.lang.Override
public void finish(org.support.project.common.bat.JobResult result) {
    org.support.project.ormapping.connection.ConnectionManager.getInstance().addConnectionConfig(connectionConfig);
    org.support.project.web.bean.MessageResult message = new org.support.project.web.bean.MessageResult();
    message.setMessage(("Processing has been completed. [status]" + (result.getResultCode())));
    try {
        session.getBasicRemote().sendText(net.arnx.jsonic.JSON.encode(message));
    } catch (net.arnx.jsonic.JSONException | java.io.IOException e) {
        org.support.project.knowledge.websocket.DataTransferEndpoint.LOG.warn("websocket message send error", e);
    }
}