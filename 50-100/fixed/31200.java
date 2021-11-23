@java.lang.Override
public void onClick(android.view.View v) {
    org.zeropage.causcheduler.Network.PortalNetworkQueue.sendNoticeRequest(getApplicationContext(), "20146824", 99382, new com.android.volley.Response.Listener() {
        @java.lang.Override
        public void onResponse(java.lang.Object response) {
            try {
                org.zeropage.causcheduler.Util.PortalXmlParser portalXmlParser = new org.zeropage.causcheduler.Util.PortalXmlParser();
                portalXmlParser.parseNotice(response.toString());
                android.widget.Toast.makeText(org.zeropage.causcheduler.Activity.NetworkTestActivity.this, "성공", Toast.LENGTH_SHORT).show();
            } catch (java.lang.Exception e) {
            }
        }
    });
}