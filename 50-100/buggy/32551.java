@java.lang.Override
public void init() {
    cppcheck.initCheckerConfig();
    if (((com.samsung.sec.dexter.core.util.DexterUtil.getOS()) == (DexterUtil.OS.LINUX)) || ((com.samsung.sec.dexter.core.util.DexterUtil.getOS()) == (DexterUtil.OS.MAC))) {
        checkCppcheckPermission();
    }
    copyCppcheckRunModule();
}