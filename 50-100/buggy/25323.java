public static void main(java.lang.String[] args) {
    if ((args.length) == 0) {
        args = new java.lang.String[1];
        java.lang.System.out.println("Usage: java WordVecsIndexer <prop-file>");
        args[0] = "init.properties";
    }
    try {
        wvec.WordVecsIndexer wvIndexer = new wvec.WordVecsIndexer("init.properties");
        wvIndexer.storeClusterInfo();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}