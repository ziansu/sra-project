private java.lang.String buildEmailMessage(final org.egov.mrs.domain.entity.MarriageRegistration registration, java.lang.String msgKeyMail) {
    final java.lang.String message = mrsMessageSource.getMessage(msgKeyMail, new java.lang.String[]{ registration.getHusband().getFullName() , registration.getWife().getFullName() , registration.getRegistrationNo() }, null);
    return message;
}