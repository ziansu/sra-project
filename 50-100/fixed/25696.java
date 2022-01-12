@java.lang.Override
public void run() {
    super.run();
    try {
        com.oslorde.extra.DexDumper.dumpDex(((dalvik.system.BaseDexClassLoader) (getClassLoader())), getDir("test_dex", com.oslorde.extra.MODE_PRIVATE).getPath(), null, new java.io.File(getFilesDir(), "libs"), null, DumpMode.MODE_LOOSE);
    } catch (java.lang.Throwable e) {
        com.oslorde.extra.Utils.log(e);
    }
}