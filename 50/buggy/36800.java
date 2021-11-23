@java.lang.Override
public com.javacodegags.waterflooding.model.Caption mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    com.javacodegags.waterflooding.model.Caption caption = new com.javacodegags.waterflooding.model.Caption();
    caption.setId(rs.getInt("id"));
    caption.setName(rs.getString("caption"));
    return caption;
}