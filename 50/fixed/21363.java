@org.junit.jupiter.api.AfterAll
private static void dropAll() throws com.microsoft.sqlserver.jdbc.SQLServerException, java.sql.SQLException {
    com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.dropTables(com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.stmt);
    com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.dropCEK(com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.stmt);
    com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.dropCMK(com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.stmt);
    com.microsoft.sqlserver.testframework.util.Util.close(null, com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.stmt, com.microsoft.sqlserver.jdbc.AlwaysEncrypted.AESetup.con);
}