@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    java.io.File destFile = new java.io.File(patchTmpDir, (((mainBundleName) + "/") + relativePath));
    java.io.File baseSoFile = new java.io.File(baseApkUnzipFolder, relativePath);
    if (isBundleFile(soFile)) {
        processBundleFiles(soFile, baseSoFile, patchTmpDir);
    }else {
        if (isFileModify(soFile, baseSoFile))
            org.apache.commons.io.FileUtils.copyFile(soFile, destFile);
        
    }
    return true;
}