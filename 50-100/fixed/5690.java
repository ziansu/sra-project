public boolean isValid(java.lang.String phoneNumber) {
    if ((phoneNumber == null) || (phoneNumber.isEmpty())) {
        message = uk.gov.dvsa.motr.web.validator.PhoneNumberValidator.EMPTY_PHONE_NUMBER_MESSAGE;
        messageAtField = uk.gov.dvsa.motr.web.validator.PhoneNumberValidator.EMPTY_PHONE_NUMBER_MESSAGE;
        return false;
    }
    if (!(subscriptionsValidationService.hasMaxTwoSubscriptionsForPhoneNumber(phoneNumber))) {
        message = uk.gov.dvsa.motr.web.validator.PhoneNumberValidator.TOO_MANY_SUBSCRIPTIONS;
        messageAtField = uk.gov.dvsa.motr.web.validator.PhoneNumberValidator.TOO_MANY_SUBSCRIPTIONS_AT_FIELD;
        return false;
    }
    return validate(phoneNumber);
}