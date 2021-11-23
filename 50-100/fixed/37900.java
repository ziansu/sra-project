private void setType() {
    java.lang.String abi;
    java.lang.String type = Options.getType();
    if (type == null) {
        com.uzen.slimapk.SlimApk.log.w("Variable 'type' was null inside method getType.");
    }
    switch (type) {
        case "arm" :
            abi = com.uzen.slimapk.struct.AndroidConstants.ABI_ARMv7;
            break;
        case "arm64" :
            abi = com.uzen.slimapk.struct.AndroidConstants.ABI_ARMv8;
            break;
        case "x86" :
            abi = com.uzen.slimapk.struct.AndroidConstants.ABI_X86;
            break;
        default :
            abi = com.uzen.slimapk.struct.AndroidConstants.ABI_ARM;
    }
    Options.setABI(abi);
    com.uzen.slimapk.SlimApk.log.d("ABI: ", abi);
}