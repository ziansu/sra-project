@org.junit.Test
public void testTPCH() throws java.lang.Exception {
    java.util.Properties props = org.jdbcsqltest.jdbcSQLTest.getDBProperties();
    props.put(Config.TEST_TYPE, Config.TEST_TYPE_TPCH);
    props.put(Config.RESOURCES_FOLDER, "./resources/tpch");
    props.put(Config.SCALE_FACTOR, Config.SCALE_FACTOR_0_01);
    org.jdbcsqltest.Main.Main(props);
}