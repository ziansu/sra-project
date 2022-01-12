public static java.lang.String getFileDelimiter(final boolean escaped) {
    if (escaped && ((com.spectralogic.ds3cli.util.SterilizeString.fs.compareTo("\\")) == 0)) {
        return "\\" + (com.spectralogic.ds3cli.util.SterilizeString.fs);
    }
    return com.spectralogic.ds3cli.util.SterilizeString.fs;
}