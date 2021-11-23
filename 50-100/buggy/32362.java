public void validateThirdPartyProductInfo(final com.blackducksoftware.integration.validator.ValidationResults result) {
    if (org.apache.commons.lang3.StringUtils.isBlank(thirdPartyName.getName())) {
        result.addResult(PhoneHomeRequestFieldEnum.THIRDPARTYNAME, new com.blackducksoftware.integration.validator.ValidationResult(com.blackducksoftware.integration.validator.ValidationResultEnum.ERROR, "No third party name was found."));
    }else
        if (org.apache.commons.lang3.StringUtils.isBlank(thirdPartyVersion)) {
            result.addResult(PhoneHomeRequestFieldEnum.THIRDPARTYVERSION, new com.blackducksoftware.integration.validator.ValidationResult(com.blackducksoftware.integration.validator.ValidationResultEnum.ERROR, java.lang.String.format("No version of %s was found.", thirdPartyName)));
        }
    
}