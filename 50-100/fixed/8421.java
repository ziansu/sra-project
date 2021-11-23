private void updateTables(java.sql.Statement statement) throws java.sql.SQLException {
    int version = getUserVersion(statement);
    if ((version > 0) && (version < (gui.Splash.DATABASE_VERSION))) {
        switch (version) {
            case 0 :
                statement.executeUpdate("alter table volumes add column favorite_volume tinyint(1) not null default '0';");
                statement.executeUpdate(java.lang.String.format("alter table volumes add column date_add_volume text not null default '%s';", utils.DateUtils.toString(new java.util.Date())));
                break;
        }
    }
    setUserVersion(statement, Splash.DATABASE_VERSION);
}