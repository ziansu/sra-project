public synchronized void cache(ws.argo.CLClient.listener.ExpiringService service) {
    cache.put(service.service.getId(), service);
}