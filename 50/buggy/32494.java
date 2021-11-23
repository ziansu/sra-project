public static void main(java.lang.String[] args) {
    HashMap<java.lang.String, java.lang.Object> config = readArgs(args);
    java.lang.Double[][] data = readFile(config.get("path"));
}