public static java.lang.String sqlExecutable(com.hangum.tadpole.engine.query.dao.system.UserDBDAO userDB, java.lang.String exeSQL) {
    exeSQL = org.apache.commons.lang.StringUtils.trimToEmpty(exeSQL);
    if (((userDB.getDBDefine()) != (com.hangum.tadpole.engine.define.DBDefine.ORACLE_DEFAULT)) | ((userDB.getDBDefine()) != (com.hangum.tadpole.engine.define.DBDefine.TIBERO_DEFAULT))) {
        exeSQL = com.hangum.tadpole.engine.sql.util.SQLUtil.removeComment(exeSQL);
        exeSQL = org.apache.commons.lang.StringUtils.removeEnd(exeSQL, PublicTadpoleDefine.SQL_DELIMITER);
    }
    exeSQL = org.apache.commons.lang.StringUtils.trimToEmpty(exeSQL);
    exeSQL = org.apache.commons.lang.StringUtils.removeEnd(exeSQL, "/");
    return exeSQL;
}