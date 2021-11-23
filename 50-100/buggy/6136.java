public java.util.Map<java.lang.String, java.lang.String> getVariable() {
    java.util.Map<java.lang.String, java.lang.String> value = null;
    if ((this.variable) != null) {
        value = this.variable;
    }
    if (value == null) {
        if ((this.category) != null) {
            value = this.category.getVariable();
        }
    }
    if (value == null) {
        value = getParent().getVariable();
    }
    return value;
}