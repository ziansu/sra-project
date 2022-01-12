public boolean isAllFieldsNull() {
    if (org.apache.commons.lang3.StringUtils.isBlank(street1))
        return false;
    
    if (org.apache.commons.lang3.StringUtils.isBlank(street2))
        return false;
    
    if (org.apache.commons.lang3.StringUtils.isBlank(zip))
        return false;
    
    if (org.apache.commons.lang3.StringUtils.isBlank(city))
        return false;
    
    if (org.apache.commons.lang3.StringUtils.isBlank(country))
        return false;
    
    return true;
}