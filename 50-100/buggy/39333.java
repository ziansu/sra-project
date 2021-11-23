public com.rockson.servletplus.ParamValidator notEmpty(java.lang.String... tip) {
    if (((this.goOn) && (null != (this.value))) && (!("".equals(this.value)))) {
        this.addError(java.lang.String.format("%s can not be empty.", name), tip);
    }
    return this;
}