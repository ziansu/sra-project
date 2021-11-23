@java.lang.Override
public boolean validate() {
    com.au.personal.safety.email.EmailMessage[] parameters = new com.au.personal.safety.email.EmailMessage[]{ emailMessage };
    performBasicValidation(parameters);
    if (isRequestValid) {
        if (((isEmailMissingRequiredParts()) || (!(isRecipientsEmailAddressesValid()))) || (isDuplicateRecipientEmailAddresses())) {
            buildResponse();
            isRequestValid = false;
        }
    }else {
        buildResponse();
    }
    return isRequestValid;
}