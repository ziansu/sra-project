public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String outputPath = "";
    try {
        com.parse.QueryParser.loadData(outputPath, args[0]);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
        e.printStackTrace();
    }
}