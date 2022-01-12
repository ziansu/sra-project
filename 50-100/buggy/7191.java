@org.junit.BeforeClass
public static void initialize() {
    Testing.Hub.start();
    Hub.logger.info("Begin Controller Unit Tests... \n");
    try {
        Testing.DeleteController.run("500");
        Testing.DeleteController.run("1000");
        java.lang.String[] fields = new java.lang.String[]{ "id" , "blade_size" , "start_date" , "hours_used" };
        java.lang.String[] values = new java.lang.String[]{ "1000" , "11" , "2012-08-06 08:11:12" , "30" };
        Testing.AddController.run(fields, values);
    } catch (java.sql.SQLException e) {
    }
}