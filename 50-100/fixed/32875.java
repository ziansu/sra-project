public static void main(java.lang.String[] args) throws java.lang.Exception {
    de.greenrobot.daogenerator.Schema schema = new de.greenrobot.daogenerator.Schema(com.dean.greendao.MyGenerator.DATA_VERSION_CODE, com.dean.greendao.MyGenerator.PACKAGE_NAME);
    com.dean.greendao.MyGenerator.addGeocode(schema);
    com.dean.greendao.MyGenerator.addRoute(schema);
    new de.greenrobot.daogenerator.DaoGenerator().generateAll(schema, com.dean.greendao.MyGenerator.DAO_PATH);
}