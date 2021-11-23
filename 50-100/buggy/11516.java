public java.lang.String getMdScript() {
    if ("".equals(this.mdScript)) {
        return null;
    }
    java.lang.String function = ((("function " + (this.name)) + "(") + (this.params)) + ") {\n";
    function = function + (this.mdScript);
    function = function + "\n}";
    return function;
}