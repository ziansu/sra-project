@java.lang.Override
public void onResponse(com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse response) {
    final java.lang.String outputText = response.getText().get(1);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            conversation.append(android.text.Html.fromHtml((("<p><b>Bot:</b> " + outputText) + "</p")));
        }
    });
}