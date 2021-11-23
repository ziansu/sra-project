@org.springframework.context.annotation.Bean(name = "intervalDuration")
java.time.Duration intervalDuration() {
    final java.lang.String interval = properties.getInterval();
    if ((interval == null) || (interval.isEmpty())) {
        log.warn("No interval was specified; using default: {}", sg.ncl.service.mail.MailAutoConfiguration.DEFAULT_INTERVAL);
        return sg.ncl.service.mail.MailAutoConfiguration.DEFAULT_INTERVAL;
    }
    try {
        final java.time.Duration duration = java.time.Duration.parse(com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value);
        log.info("Using specified interval duration: {}", duration);
        return duration;
    } catch (java.time.format.DateTimeParseException e) {
        log.warn("{}: '{}'; using default: {}", e, com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value, sg.ncl.service.mail.MailAutoConfiguration.DEFAULT_INTERVAL);
        return sg.ncl.service.mail.MailAutoConfiguration.DEFAULT_INTERVAL;
    }
}