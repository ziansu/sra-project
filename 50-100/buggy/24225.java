public void sendEvent() {
    synchronized(this) {
        if ((mSended.get()) != true) {
            java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();
            params.put("ref", getRef());
            com.taobao.gcanvas.util.GLog.d(("send event in gcanvas component.params=" + (params.toString())));
            getInstance().fireGlobalEventCallback("GCanvasReady", params);
            mSended.set(true);
        }else {
            com.taobao.gcanvas.util.GLog.d("event sended.");
        }
    }
}