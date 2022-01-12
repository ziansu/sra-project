private static java.lang.String dump(java.util.List<com.slang.utils.cmdline.CMDLine.Option> options, boolean defaultsOnly) {
    java.lang.String strBuild = "";
    for (com.slang.utils.cmdline.CMDLine.Option option : options) {
        if (defaultsOnly) {
            if (option.isDefault)
                strBuild += (option.toString()) + "\n";
            else
                continue;
            
        }else {
            strBuild += (option.toString()) + "\n";
        }
    }
    return strBuild;
}