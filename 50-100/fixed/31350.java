public static com.clubeek.model.ClubSettings select(int id, com.clubeek.db.RepClubSettings.TableColumn[] columns) {
    columns = com.clubeek.db.RepClubSettings.getColumns(columns);
    java.util.List<com.clubeek.model.ClubSettings> clubSettingsList = com.clubeek.db.Admin.query(com.clubeek.model.ClubSettings.class, java.lang.String.format("SELECT %s FROM %s WHERE %s = %d", com.clubeek.db.Admin.createSelectParams(columns), com.clubeek.db.RepClubSettings.tableName, com.clubeek.db.RepClubSettings.TableColumn.ID.name, id), columns, com.clubeek.db.RepClubSettings.getInstance());
    return (clubSettingsList != null) && ((clubSettingsList.size()) == 1) ? clubSettingsList.get(0) : null;
}