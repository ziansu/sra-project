public com.intel.genomicsdb.GenomicsDBConf setHostFile(java.lang.String path) throws java.io.FileNotFoundException {
    set(com.intel.genomicsdb.GenomicsDBConf.MPIHOSTFILE, path);
    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(path));
    while (scanner.hasNextLine()) {
        java.lang.String host = scanner.nextLine();
        hosts.add(host);
    } 
    return this;
}