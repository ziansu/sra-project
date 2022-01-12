public byte[] downloadTMDToByteArray(long titleID, int version) throws java.io.IOException {
    java.lang.String version_suf = "";
    if (version > 0)
        version_suf = "." + version;
    
    java.lang.String URL = ((((de.mas.jnustool.util.Downloader.URL_BASE) + "/") + (java.lang.String.format("%016X", titleID))) + "/tmd") + version_suf;
    java.lang.System.out.println(URL);
    return downloadFileToByteArray(URL);
}