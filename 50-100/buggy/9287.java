private void post(org.daisy.common.messaging.Message.MessageBuilder builder) {
    if ((props.getProperty("JOB_ID")) != null) {
        builder.withJobId(props.getProperty("JOB_ID"));
    }
    builder.withSequence(((sequence)++));
    builder.withTimeStamp(new java.util.Date());
    eventBus.get().post(builder.build());
}