@org.springframework.web.bind.annotation.RequestMapping(value = "/receive", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String receive() {
    demo.RabbitCloudController.logger.info("In receive");
    org.springframework.context.ApplicationContext ctx = demo.RabbitCloudApplication.getApplicationContext();
    org.springframework.amqp.rabbit.core.RabbitTemplate rabbitTemplate = ((org.springframework.amqp.rabbit.core.RabbitTemplate) (ctx.getBean(org.springframework.amqp.rabbit.core.RabbitTemplate.class)));
    java.lang.String message = ((java.lang.String) (rabbitTemplate.receiveAndConvert(RabbitCloudApplication.queueName)));
    if (message == null) {
        message = "No messages in queue " + (RabbitCloudApplication.queueName);
    }else {
        demo.RabbitCloudController.logger.info(("Received: " + message));
    }
    return message;
}