@java.lang.Override
public java.lang.Void registerUserIP(java.lang.CharSequence userIP, int userPort) throws org.apache.avro.AvroRemoteException {
    f_userConnection = new client.util.ConnectionData(userIP.toString(), userPort);
    java.lang.System.out.println(f_userConnection.toString());
    f_safeToClose = true;
    return null;
}