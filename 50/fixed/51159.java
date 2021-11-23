public java.util.List<java.lang.String> getHostControllerJavaOpts() {
    if (((hostControllerJavaOpts.size()) == 0) && ((containerType) != null)) {
        return containerType.javaOptions(this);
    }
    return hostControllerJavaOpts;
}