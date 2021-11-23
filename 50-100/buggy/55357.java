public java.lang.String loadModulePrepare(java.lang.String modName, java.lang.String modPath) {
    log(org.sikuli.util.JythonHelper.lvl, "loadModulePrepare: %s in %s", modName, modPath);
    int nDot = modName.lastIndexOf(".");
    if (nDot > (-1)) {
        modName = modName.substring((nDot + 1));
    }
    addSysPath(modPath);
    if (modPath.endsWith(".sikuli")) {
        org.sikuli.script.ImagePath.add(modPath);
    }
    return modName;
}