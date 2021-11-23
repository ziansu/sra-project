@java.lang.Override
public void onMessage(java.lang.String message) {
    java.lang.System.out.println(message);
    connection.onMessage(message);
}