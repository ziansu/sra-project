protected boolean isDownloadComplete() {
    if (isFileComplete()) {
        return true;
    }
    if (((externalDownloadStop()) == false) && (hasErrors())) {
        logger.info("isDownloadComplete: errorFree=true");
        return true;
    }
    logger.info("isDownloadComplete: false");
    return false;
}