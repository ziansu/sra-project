@com.greenfox.controller.CrossOrigin(value = "*")
@com.greenfox.controller.PostMapping(value = "/api/message/receive")
public com.greenfox.model.StatusOkMessage receiveMessage(@com.greenfox.controller.RequestBody
com.greenfox.model.ReceivedMessage message) throws java.io.IOException {
    p2PService.receiveNewMessage(message);
    return new com.greenfox.model.StatusOkMessage();
}