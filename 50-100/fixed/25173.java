public java.util.List<java.lang.String> createProcessArguments() {
    java.lang.String memorySetting = ("-mx" + (getHeapSize())) + "m";
    java.util.List<java.lang.String> args = com.google.common.collect.Lists.newArrayList(getJavaExecutable(), memorySetting);
    args.addAll(additionalArgs);
    args.addAll(addCustomArguments());
    return args;
}