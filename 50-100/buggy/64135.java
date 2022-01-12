java.lang.String sendState() throws java.lang.Exception {
    java.lang.String message4 = new receiver.StateMsgImpl("sender", new receiver.StateImpl(receiver.StateType.Created(), "thID").defaultRepresentation()).defaultRepresentation();
    this.channel.basicPublish(utils.RabbitInfo.EXCHANGE_NAME(), "", null, message4.getBytes());
    return message4;
}