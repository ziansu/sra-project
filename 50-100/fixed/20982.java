private void checkRetentionTime(final org.springframework.validation.Errors errors, final org.zalando.nakadi.domain.EventTypeOptions options) {
    if (options == null) {
        return ;
    }
    final java.lang.Long retentionTime = options.getRetentionTime();
    if (retentionTime != null) {
        if (retentionTime > (maxTopicRetentionMs)) {
            createError(errors, ("can not be more than " + (maxTopicRetentionMs)));
        }else
            if (retentionTime < (minTopicRetentionMs)) {
                createError(errors, ("can not be less than " + (minTopicRetentionMs)));
            }
        
    }
}