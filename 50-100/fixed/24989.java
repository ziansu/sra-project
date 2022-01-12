@java.lang.Override
public void parseErrorTags(org.springframework.cloud.sleuth.Span span, java.lang.Throwable error) {
    if ((span != null) && (span.isExportable())) {
        java.lang.String errorMsg = org.springframework.cloud.sleuth.util.ExceptionUtils.getExceptionMessage(error);
        if (org.springframework.cloud.sleuth.ExceptionMessageErrorParser.log.isDebugEnabled()) {
            org.springframework.cloud.sleuth.ExceptionMessageErrorParser.log.debug(((("Adding an error tag [" + errorMsg) + "] to span ") + span));
        }
        span.tag(Span.SPAN_ERROR_TAG_NAME, errorMsg);
    }
}