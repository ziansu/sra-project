@java.lang.Override
public void success(com.google.gson.JsonObject message, retrofit.client.Response response) {
    com.homelybuysapp.connection.ServerConnectionMaker.recieveResponse(response);
    calling_class_object_internal.PackListSuccess(packlist);
    CartGlobals.CartServerRequestQueue.removeFirst();
    if (!(CartGlobals.CartServerRequestQueue.isEmpty())) {
        com.homelybuysapp.connection.ServerConnectionMaker.sendRequest(CartGlobals.CartServerRequestQueue.peekFirst());
    }
}