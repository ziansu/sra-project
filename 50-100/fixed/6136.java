public java.util.Map<java.lang.String, java.lang.String> getVariable() {
    if ((this.variable) != null) {
        return this.variable;
    }
    if ((this.category) != null) {
        return this.category.getVariable();
    }
    return getParent().getVariable();
}