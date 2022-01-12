private static void pushSingle(char flag, java.lang.String value) {
    boolean supported = com.slang.utils.cmdline.CMDLine.isFlagValid((flag + ""), value, true);
    com.slang.utils.cmdline.CMDLine.Option opt = new com.slang.utils.cmdline.CMDLine.Option(flag, null);
    opt.value = value;
    opt.supported = supported;
    com.slang.utils.cmdline.CMDLine.optionsParsed.add(opt);
}