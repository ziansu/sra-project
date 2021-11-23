private void parseParamTypes() {
    while (true) {
        java.lang.String t = this.parseFieldType();
        if (com.google.common.base.Strings.isNullOrEmpty(t)) {
            this.md.getParameterTypes().add(t);
        }else {
            break;
        }
    } 
}