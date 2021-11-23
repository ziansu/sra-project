@java.lang.Override
public void sendToMachines(java.util.ArrayList<java.lang.String> machines, java.lang.String json) throws se.kth.tablespoon.client.broadcasting.BroadcastException {
    java.lang.System.out.println(("Sending to machines: " + machines));
    java.lang.System.out.println(("Information (json): " + json));
    (recievedRequests)++;
}