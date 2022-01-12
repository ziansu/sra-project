private void save(T value) {
    switch (storageType) {
        case LOCAL :
            net.wbz.moba.controlcenter.web.client.LocalStorage.getInstance().set(getConfigKey(), convertValueToString(value));
            break;
        case REMOTE :
            net.wbz.moba.controlcenter.web.client.ServiceUtils.getConfigService().saveValue(getConfigKey(), convertValueToString(value), new net.wbz.moba.controlcenter.web.client.util.EmptyCallback<java.lang.Void>());
            break;
    }
}