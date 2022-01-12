public java.lang.String getTargetValidatorNames() {
    java.lang.String[] validatorIds = getTargetValidatorIds();
    java.lang.String validatorNames = "";
    for (java.lang.String validatorId : validatorIds) {
        if (com.silverpeas.util.StringUtil.isDefined(validatorNames)) {
            validatorNames += ", ";
        }
        validatorNames += com.stratelia.webactiv.beans.admin.UserDetail.getById(validatorId).getDisplayedName();
    }
    return validatorNames;
}