public java.lang.String concatenateExceptionListElements() {
    java.lang.String joined = com.sun.deploy.util.StringUtils.join(exceptionList, ",");
    return joined;
}