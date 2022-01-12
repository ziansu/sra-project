public java.lang.String getTargetValidatorNames() {
    java.lang.String validatorNames = "";
    java.lang.String[] validatorIds = getTargetValidatorIds();
    if (validatorIds != null) {
        for (java.lang.String validatorId : validatorIds) {
            if (com.silverpeas.util.StringUtil.isDefined(validatorNames)) {
                validatorNames += ", ";
            }
            validatorNames += com.stratelia.webactiv.beans.admin.UserDetail.getById(validatorId).getDisplayedName();
        }
    }
    return validatorNames;
}