private static boolean isPCGenCampaignFile(final java.io.File file) {
    if (!(file.isFile())) {
        return false;
    }
    return pcgen.io.PCGFile.getWindowsSafeFilename(file).endsWith(Constants.EXTENSION_CAMPAIGN_FILE);
}