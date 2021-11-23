@java.lang.Override
public void prepareForDeferredProcessing() {
    loggingEvent.prepareForDeferredProcessing();
    java.lang.Object[] args = loggingEvent.getArgumentArray();
    if ((args != null) && ((argumentArray) != null)) {
        argumentArray = new java.lang.Object[args.length];
        for (int i = 0; i < (args.length); i++) {
            argumentArray[i] = args[i].toString();
        }
    }
}