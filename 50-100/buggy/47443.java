public static java.lang.String cleanRomName(java.lang.String rom, boolean hard) {
    java.lang.String cleanRom = rom;
    cleanRom = cleanRom.replaceAll("\\([^\\)]*\\)", "");
    cleanRom = cleanRom.replaceAll("\\[[^\\]]*\\]", "");
    cleanRom = daaa.qdscraper.utils.RomCleaner.removeExtension(rom);
    if (hard) {
        cleanRom = cleanRom.replaceAll("[-!:,;.%?_']", " ");
    }
    cleanRom = daaa.qdscraper.utils.RomCleaner.removeMultiSpaces(cleanRom);
    cleanRom = cleanRom.trim();
    return cleanRom;
}