public com.intel.genomicsdb.GenomicsDBConf setHostFile(java.lang.String path) throws java.io.FileNotFoundException {
    set(com.intel.genomicsdb.GenomicsDBConf.MPIHOSTFILE, path);
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(com.intel.genomicsdb.GenomicsDBConf.class);
    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(path));
    while (scanner.hasNextLine()) {
        java.lang.String host = scanner.nextLine();
        hosts.add(host);
        logger.error(("host file content: " + host));
    } 
    return this;
}