@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.liangmayong.netbox.Netbox.server(com.liangmayong.android_netbox.DemoService.class).path().method(Method.POST).exec(new com.liangmayong.netbox.callbacks.OnNetboxCallback<com.liangmayong.android_netbox.DemoBean>() {
        @java.lang.Override
        public void handleResponseSuccess(com.liangmayong.android_netbox.DemoBean data) {
        }

        @java.lang.Override
        public void handleResponseError(java.lang.String code, java.lang.String message) {
        }

        @java.lang.Override
        public void onFailure(com.liangmayong.netbox.throwables.NetboxError error) {
        }
    });
}