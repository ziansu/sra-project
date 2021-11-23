@java.lang.Override
public void onClientLostRoute(client.Client client) {
    java.lang.System.out.println("Lost Route!");
    removeUser(client.getName());
}