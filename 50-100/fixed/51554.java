public void writeKnownRemoteDatabases(java.util.List<org.syncany.plugins.transfer.files.DatabaseRemoteFile> remoteDatabases) throws java.sql.SQLException {
    if ((remoteDatabases.size()) == 0) {
        return ;
    }
    java.sql.PreparedStatement preparedStatement = getStatement("application.insert.all.persistNewKnownRemoteDatabases.sql");
    for (org.syncany.plugins.transfer.files.DatabaseRemoteFile databaseRemoteFile : remoteDatabases) {
        preparedStatement.setString(1, databaseRemoteFile.getClientName());
        preparedStatement.setInt(2, ((int) (databaseRemoteFile.getClientVersion())));
        preparedStatement.addBatch();
    }
    preparedStatement.executeBatch();
}