@java.lang.Override
boolean joinQueue(com.baodanyun.websocket.bean.user.AbstractUser customer) {
    com.baodanyun.websocket.bean.msg.Msg hello = getMsgHelloToVisitor(customer);
    hello.setFrom(this.getAbstractUser().getOpenId());
    com.baodanyun.websocket.node.sendUtils.WeChatSendUtils.send(hello);
    return true;
}