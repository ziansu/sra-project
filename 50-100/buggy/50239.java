private java.lang.String getTex4htArgument(java.lang.String[] args, int index) {
    boolean returnEmptyArg = ((args == null) || ((args.length) < (index + 1))) || (org.apache.commons.lang.StringUtils.isEmpty(args[index]));
    return returnEmptyArg ? "" : args[index];
}