protected boolean isCollectFile(java.lang.String[] targetExts, java.lang.String targetKeyword, java.util.List<java.lang.String> exceptPathList, java.io.File currentFile) {
    if (isExceptFile(exceptPathList, currentFile)) {
        return false;
    }
    for (java.lang.String ext : targetExts) {
        if (isHitByTargetExt(toPath(currentFile), ext, targetKeyword)) {
            return true;
        }
    }
    return false;
}