@java.lang.Override
public void run() {
    me.ele.amigo.release.ApkReleaser.isReleasing = true;
    android.os.SystemClock.sleep(6000);
    me.ele.amigo.utils.DexReleaser.releaseDexes(patchApks.patchFile(checksum), amigoDirs.dexDir(checksum));
    me.ele.amigo.compat.NativeLibraryHelperCompat.copyNativeBinaries(patchApks.patchFile(checksum), amigoDirs.libDir(checksum));
    dexOptimization(checksum);
}