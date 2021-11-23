public boolean isMobilePhoneNotNull(java.lang.String mobilePhone) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(mobilePhone)) {
        return true;
    }else {
        unsatisfiedReasons.put(ResponseStatus.CELLPHONE_IS_NULL.getCode(), ResponseStatus.CELLPHONE_IS_NULL.getMessage());
        return false;
    }
}