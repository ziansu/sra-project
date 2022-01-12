public void dump(java.util.HashMap<java.lang.Integer, java.util.LinkedHashMap<java.lang.Integer, java.util.LinkedHashMap<java.lang.Integer, java.lang.Double>>> map) {
    java.lang.System.out.println((("Data dumping on path " + (path)) + " ..."));
    this.map = map;
    this.makeDirectories();
    this.readRandomlyChosenUsers();
    try {
        this.check();
        this.print();
    } catch (nervousnet.challenge.exceptions.MissingDataException e) {
        e.printStackTrace();
        java.lang.System.err.println("Data will not be dumped to disk!");
    }
    java.lang.System.out.println("Data dumping finished!");
}