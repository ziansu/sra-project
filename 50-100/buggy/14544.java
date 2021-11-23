public static void main(java.lang.String[] args) {
    if ((args.length) != 2) {
        java.lang.System.out.println("Usage: InstallLocal <dbname>");
        return ;
    }
    Config.DB_NAME = args[0];
    java.lang.System.out.println("Schema installation started ...");
    org.xdb.InstallLocal client = new org.xdb.InstallLocal();
    client.run();
    java.lang.System.out.println("Finished!");
}