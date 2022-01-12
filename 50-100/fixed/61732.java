private android.content.Intent doBGforSB() {
    if (new java.io.File(com.rfo.basic.Basic.getFilePath()).exists()) {
        copyAssets(com.rfo.basic.Basic.AppPath);
        doFirstLoad();
    }else {
        doCantLoad();
    }
    com.rfo.basic.Basic.DoAutoRun = false;
    return new android.content.Intent(this, com.rfo.basic.Editor.class);
}