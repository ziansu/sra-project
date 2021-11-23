public java.lang.String getShortLogMessage() {
    int args = this.method.getParameterTypes().length;
    return (((((getBeanType().getName()) + "#") + (this.method.getName())) + "[") + args) + " args]";
}