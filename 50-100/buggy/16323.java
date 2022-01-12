private void build(java.io.File f) throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    connect(f);
    java.sql.Statement s = uk.ac.shef.dcs.oak.electro.Model.database.createStatement();
    s.executeUpdate("DROP TABLE IF EXISTS electro");
    s.executeUpdate("CREATE TABLE electro (dt TIMESTAMP, temp DOUBLE, watts INTEGER)");
    s.executeUpdate("CREATE INDEX dt_index ON electro (dt)");
    sync(new java.io.File("/Users/sat/workspace/electricity/data2/"), (((java.lang.System.currentTimeMillis()) / 1000) - (offsetEnd)));
    s.close();
}