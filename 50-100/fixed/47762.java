public void downloadTMD(long titleID, int version, java.lang.String path) throws java.io.IOException {
    java.lang.String version_suf = "";
    if (version > 0)
        version_suf = "." + version;
    
    java.lang.String URL = ((((de.mas.jnustool.util.Downloader.URL_BASE) + "/") + (java.lang.String.format("%016X", titleID))) + "/tmd") + version_suf;
    downloadFile(URL, "title.tmd", path, null);
}