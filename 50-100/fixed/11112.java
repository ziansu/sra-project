@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.innovationplayground.sessionexecutiontestclient.communication.authapi.AuthProxy authProxy = new com.innovationplayground.sessionexecutiontestclient.communication.authapi.AuthProxy();
    com.innovationplayground.sessionexecutiontestclient.storage.Storage storage = com.innovationplayground.sessionexecutiontestclient.storage.Storage.getInstance(getActivity());
    clientAuthenticator = new com.innovationplayground.sessionexecutiontestclient.business.ClientAuthenticator(authProxy, storage);
    if (!(com.innovationplayground.sessionexecutiontestclient.PermissionUtil.hasWriteExternalStoragePermission(getActivity()))) {
        com.innovationplayground.sessionexecutiontestclient.PermissionUtil.requestWriteExternalStoragePermission(getActivity());
        return ;
    }
    loadClients();
}