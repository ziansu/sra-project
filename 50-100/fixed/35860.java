public static void initProps() {
    if ((GeneticRobotProperties.props) == null) {
        GeneticRobotProperties.props = new java.util.Properties();
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("default.properties");
            GeneticRobotProperties.props.load(fis);
            fis.close();
        } catch (java.io.FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        for (java.lang.String s : GeneticRobotProperties.props.stringPropertyNames()) {
            java.lang.System.out.println(s);
        }
    }
}