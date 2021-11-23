public static void main(java.lang.String[] args) throws java.lang.Exception {
    util.ConfigManager.loadConfig();
    main.Files2Facts filesAMLInRDF = new main.Files2Facts();
    try {
        filesAMLInRDF.readFiles(util.ConfigManager.getFilePath());
        filesAMLInRDF.generateExtensionalDB(util.ConfigManager.getFilePath());
        main.DeductiveDB deductiveDB = new main.DeductiveDB();
        deductiveDB.consultKB();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}