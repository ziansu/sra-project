@java.lang.Override
protected ch.schoeb.opendatatransport.model.ConnectionList doInBackground(java.lang.String... arg) {
    connectionList = connectionSearch.searchConnections(arg[0], arg[1], null, null, null, false);
    return connectionList;
}