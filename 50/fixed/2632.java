@org.springframework.scheduling.annotation.Scheduled(fixedDelay = java.lang.Integer.MAX_VALUE)
public void postMail() {
    for (; jmsTemplate.convertAndSend(QueueEnum.MAIL.getQueue(), java.lang.String.format("Hello %04d", (++(id)))););
}