public void purpose() throws java.sql.SQLException {
    if ((curAttributes) == null) {
        obtainCurAttributes();
    }
    if (!(curAttributes.contains("fix"))) {
        sql = "alter table extraction1 add fix tinyint(1) default 0";
        stmt.executeUpdate(sql);
        curAttributes.add("fix");
    }
    for (java.lang.Integer integer : commitIdPart) {
        sql = "UPDATE extraction1,scmlog SET fix=is_bug_fix where extraction1.commit_id=scmlog.id and extraction1.commit_id=" + integer;
        stmt.executeUpdate(sql);
    }
}