private java.lang.String generateClientDownloadDirName(com.sipe.entities.Client client) {
    if (!(isInitialized))
        return null;
    
    return ((client.getCodeClient().replaceAll(" ", "_")) + "__") + (org.joda.time.format.DateTimeFormat.forPattern("dd-MM-yy_HH.mm.ss").print(new org.joda.time.DateTime()));
}