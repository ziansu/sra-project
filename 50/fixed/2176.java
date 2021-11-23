@java.lang.Override
public void send(java.lang.String replyMessage) {
    ng.abdlquadri.eventbus.EventBus.send(replyAddress.toString(), replyMessage);
}