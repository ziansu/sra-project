private void clearExpired() {
    java.util.Iterator<java.util.Map.Entry<java.lang.String, ws.argo.CLClient.listener.ExpiringService>> it = cache.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry<java.lang.String, ws.argo.CLClient.listener.ExpiringService> pair = it.next();
        ws.argo.CLClient.listener.ExpiringService infoBean = ((ws.argo.CLClient.listener.ExpiringService) (pair.getValue()));
        if (infoBean.isExpired()) {
            it.remove();
        }
    } 
}