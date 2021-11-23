private void handleOnDestroyOne(android.content.pm.ServiceInfo targetInfo) {
    android.app.Service service = mNameService.get(targetInfo.name);
    if (service != null) {
        service.onDestroy();
        mNameService.remove(targetInfo.name);
        java.lang.Object token = findTokenByService(service);
        mTokenServices.remove(token);
        mServiceTaskIds.remove(token);
        me.ele.amigo.compat.QueuedWorkCompat.waitToFinish();
    }
    me.ele.amigo.compat.QueuedWorkCompat.waitToFinish();
}