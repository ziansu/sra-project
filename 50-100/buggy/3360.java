public com.twilio.Node whatNext(java.lang.String userOption) {
    java.util.Set<java.lang.String> currentOptions = options.keySet();
    for (java.lang.String option : currentOptions) {
        if (userOption.equals(option)) {
            return options.get(option);
        }
    }
    return null;
}