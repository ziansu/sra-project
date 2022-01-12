@org.springframework.web.bind.annotation.ExceptionHandler(value = com.carser.viamais.exception.LogException.class)
public void handleException(final com.carser.viamais.exception.LogException e) {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(e.getSource());
    logger.error(e.getMessage());
    com.carser.viamais.entity.MailConfiguration config = mailConfigurationRepository.findByEvent(MailConfiguration.Event.ERROR_MESSAGE);
    mailService.sendHtmlEmail(adminMail, config.getDefaultSender(), config.getDefaultSubject(), e.getMessage());
}