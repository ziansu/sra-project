public void fromEntity(th.co.baiwa.buckwaframework.preferences.persistence.entity.SysMessage message) {
    this.messageId = message.getMessageId();
    this.messageCode = message.getMessageCode();
    this.messageEn = message.getMessageEn();
    this.messageTh = message.getMessageTh();
    this.messageType = message.getMessageType();
}