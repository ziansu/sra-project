private java.lang.String buildEmailMessage(final org.egov.mrs.domain.entity.MarriageRegistration registration, java.lang.String msgKeyMail, java.lang.String number) {
    final java.lang.String message = mrsMessageSource.getMessage(msgKeyMail, new java.lang.String[]{ registration.getHusband().getFullName() , registration.getWife().getFullName() , number }, null);
    return message;
}