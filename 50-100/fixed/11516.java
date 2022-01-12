public java.lang.String getMdScript() {
    if ("".equals(this.mdScript)) {
        return null;
    }
    java.lang.String function = ((("function " + (this.getName())) + "(") + (this.params)) + ") {\n";
    function = function + (this.mdScript);
    function = function + "\n}";
    return function;
}