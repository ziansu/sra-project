public static org.springframework.http.HttpHeaders createFailureAlert(java.lang.String entityName, java.lang.String errorKey, java.lang.String defaultMessage) {
    log.error("Entity creation failed, {}", defaultMessage);
    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
}