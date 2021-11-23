@org.springframework.scheduling.annotation.Scheduled(fixedDelay = 500)
public void postMail() {
    jmsTemplate.convertAndSend(QueueEnum.MAIL.getQueue(), java.lang.String.format("Hello %04d", (++(id))));
}