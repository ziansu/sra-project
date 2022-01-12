public void processQRCodes(java.lang.String codeName) {
    if (path.empty()) {
        path.push(codeName);
        startTimeMillis = java.lang.System.currentTimeMillis();
    }else {
        smarterPathFinder(codeName);
    }
}