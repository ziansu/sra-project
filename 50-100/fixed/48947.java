public static java.lang.Boolean updateTemplate(int id, at.becast.youploader.templates.Template template) throws java.io.IOException, java.sql.SQLException {
    java.sql.PreparedStatement prest = null;
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.lang.String sql = "UPDATE `templates` SET `data`=? WHERE `id`=?";
    prest = at.becast.youploader.database.SQLite.c.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
    prest.setString(1, mapper.writeValueAsString(template));
    prest.setInt(2, id);
    boolean res = prest.execute();
    prest.close();
    return res;
}