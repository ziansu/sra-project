@java.lang.Override
public void execute(org.quartz.JobExecutionContext context) {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(com.nasimeshomal.TurnOnSpeakerJob.class);
    try {
        com.nasimeshomal.RaspGPIO.getInstance().getSpeakerPin().high();
        logger.info(java.lang.String.format("%s : Speaker is On.", new org.joda.time.DateTime().toString()));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        logger.trace(java.lang.String.format("%s : Exeption while turning Speaker On ==> %s", new org.joda.time.DateTime().toString(), e.getMessage()));
    }
}