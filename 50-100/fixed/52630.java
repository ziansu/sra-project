private void validate(org.springframework.validation.Errors errors, org.sagebionetworks.bridge.models.schedules.CompoundActivity compoundActivity) {
    errors.pushNestedPath("compoundActivity");
    java.lang.String taskIdentifier = compoundActivity.getTaskIdentifier();
    if (org.apache.commons.lang3.StringUtils.isBlank(taskIdentifier)) {
        errors.rejectValue("taskIdentifier", org.sagebionetworks.bridge.validators.ActivityValidator.CANNOT_BE_BLANK);
    }
    errors.popNestedPath();
}