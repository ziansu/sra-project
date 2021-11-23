@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    java.io.File destFile = new java.io.File(patchTmpDir, (((mainBundleName) + "/") + relativePath));
    java.io.File baseSoFile = new java.io.File(baseApkUnzipFolder, relativePath);
    if ((isBlackBundle(soFile)) || (!(com.taobao.android.tpatch.utils.PatchUtils.isBundleFile(soFile)))) {
        if (isFileModify(soFile, baseSoFile))
            org.apache.commons.io.FileUtils.copyFile(soFile, destFile);
        
    }else {
        processBundleFiles(soFile, baseSoFile, patchTmpDir);
    }
    return true;
}