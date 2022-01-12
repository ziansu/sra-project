@java.lang.Override
public com.ustudy.infocenter.model.SubjectTeac mapRow(java.sql.ResultSet rs, int row) throws java.sql.SQLException {
    java.lang.String tid = rs.getString("sub_owner");
    java.lang.String tn = null;
    if ((tid != null) && (!(tid.isEmpty()))) {
        return new com.ustudy.infocenter.model.SubjectTeac(rs.getString("sub_name"), tid, tn);
    }else
        return new com.ustudy.infocenter.model.SubjectTeac(rs.getString("sub_name"), null);
    
}