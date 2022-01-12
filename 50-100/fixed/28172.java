@java.lang.Override
public void init() {
    try {
        java.util.Properties prop = new java.util.Properties();
        java.lang.String configFileName = "./config/DBApp.properties";
        java.io.InputStream input = new java.io.FileInputStream(configFileName);
        prop.load(input);
        KDTreeN = java.lang.Integer.parseInt(prop.getProperty("KDTreeN"));
        MaximumRowsCountinPage = java.lang.Integer.parseInt(prop.getProperty("MaximumRowsCountinPage"));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}