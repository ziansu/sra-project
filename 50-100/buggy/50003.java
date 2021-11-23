@java.lang.Override
public void broadcastMigrateKeys(java.lang.Object[] metadata) {
    java.lang.Object[] params = getAsyncPushingParameters();
    java.lang.Object[] call;
    call = new java.lang.Object[]{ new org.elasql.remote.groupcomm.StoredProcedureCall((-1), (-1), MicroTransactionType.BROADCAST_MIGRAKEYS.ordinal(), params) };
    java.lang.System.out.println("I am going to send the keys");
    org.elasql.server.Elasql.connectionMgr().sendBroadcastRequest(call, true);
}