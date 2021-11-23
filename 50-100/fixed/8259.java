private void loadRomFromZip(java.lang.String zipName) throws java.io.IOException {
    final java.lang.String romName = selectRomInZip(listRomsInZip(zipName));
    if (romName != null) {
        final java.io.File extractedFile = extractRomFromZip(zipName, romName);
        if (extractedFile != null) {
            extractedFile.deleteOnExit();
            nes.loadROM(extractedFile.getCanonicalPath());
        }
    }
}