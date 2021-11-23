@com.fergoid.controller.RequestMapping(path = "/fergoid/send/{message}", method = RequestMethod.PUT)
public org.springframework.http.HttpEntity<com.fergoid.controller.Message> sendMessage(@com.fergoid.controller.PathVariable
java.lang.String message) {
    java.lang.String s = java.lang.String.format("I will publish %s to %s", message, exchangeName);
    com.fergoid.controller.MessageSenderController.log.info(s);
    assert message == null;
    rabbitTemplate.convertAndSend(exchangeName, topic, s.getBytes());
    return new org.springframework.http.ResponseEntity<com.fergoid.controller.Message>(getMessage(message), org.springframework.http.HttpStatus.OK);
}