@org.junit.BeforeClass
public static void initialize() {
    Testing.Hub.start();
    java.lang.String[] fields = new java.lang.String[]{ "id" , "blade_size" , "start_date" , "hours_used" };
    java.lang.String[] values = new java.lang.String[]{ "500" , "11" , "2012-08-06 08:11:12" , "30" };
    Hub.logger.info("Begin Controller Unit Tests... \n");
    try {
        Testing.DeleteController.run("1000");
    } catch (java.sql.SQLException e) {
    }
    try {
        Testing.AddController.run(fields, values);
    } catch (java.sql.SQLException e) {
    }
}