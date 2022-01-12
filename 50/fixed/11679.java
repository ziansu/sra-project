public void SendSystemMessage(java.lang.String msg) {
    cn.jpush.api.push.PushResult result = push(cn.jpush.api.push.model.PushPayload.alertAll(msg));
}