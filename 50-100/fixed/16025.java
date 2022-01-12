@org.springframework.web.bind.annotation.RequestMapping(value = "/receive", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String receive() {
    demo.RabbitCloudController.logger.info("In receive");
    java.lang.String message = ((java.lang.String) (rabbitTemplate.receiveAndConvert(RabbitCloudApplication.queueName)));
    if (message == null) {
        message = "No messages in queue " + (RabbitCloudApplication.queueName);
    }else {
        demo.RabbitCloudController.logger.info(("Received: " + message));
    }
    return message;
}