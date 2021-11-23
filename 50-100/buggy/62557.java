public void setEncypt(java.lang.String encryptText) {
    if ((org.apache.commons.lang3.StringUtils.isEmpty(encryptText)) && ((org.apache.commons.lang3.StringUtils.equalsIgnoreCase("yes", encryptText)) || (org.apache.commons.lang3.StringUtils.equalsIgnoreCase("true", encryptText)))) {
        setEncypt(true);
    }else {
        setEncypt(false);
    }
}