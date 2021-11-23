@java.lang.Override
public void onTextFrame(com.neovisionaries.ws.client.WebSocket websocket, com.neovisionaries.ws.client.WebSocketFrame frame) throws java.lang.Exception {
    android.util.Log.i("fg", "onTextFrame");
    adapter.notifyItemRangeChanged(0, adapter.getItemCount());
}