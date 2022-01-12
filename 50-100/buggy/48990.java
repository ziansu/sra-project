public void setAtHomeStatus(android.content.Context context, java.lang.Boolean status) {
    serverIntent = new android.content.Intent(context, aloksharma.ufl.edu.athome.ServerAccess.class);
    serverIntent.putExtra("server_action", ServerAccess.ServerAction.SET_HOME_STATUS.toString());
    serverIntent.putExtra("server_action_arg", status);
    context.startService(serverIntent);
}