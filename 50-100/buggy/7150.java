public java.lang.String getShortLogMessage() {
    int args = method.getParameterTypes().length;
    return (((((getBeanType().getName()) + "#") + (this.method.getName())) + "[") + args) + " args]";
}