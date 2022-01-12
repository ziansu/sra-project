private static void setOption() {
    me.leaver.assist.sqlclient.SqlClient.JDUL.addOption("d", "driver", true, "The driver name for your database");
    me.leaver.assist.sqlclient.SqlClient.JDUL.addOption("u", "url", true, "The url  for your database");
    me.leaver.assist.sqlclient.SqlClient.JDUL.addOption("n", "name", true, "The user for your database");
    me.leaver.assist.sqlclient.SqlClient.JDUL.addOption("p", "pass", true, "The pass for your database");
    me.leaver.assist.sqlclient.SqlClient.JDUL.addOption("s", "sql", true, "The statement you want to execute");
}