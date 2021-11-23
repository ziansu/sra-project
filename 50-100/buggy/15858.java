public void storeOneFile(com.baidu.disconf.client.common.model.DisconfCenterBaseModel disconfCenterBaseModel) {
    com.baidu.disconf.client.common.model.DisconfCenterFile disconfCenterFile = ((com.baidu.disconf.client.common.model.DisconfCenterFile) (disconfCenterBaseModel));
    java.lang.String fileName = disconfCenterFile.getFileName();
    if (confFileMap.containsKey(fileName)) {
        com.baidu.disconf.client.store.inner.DisconfCenterStore.LOGGER.error((((("There are two same fileName!!!! " + "first: ") + (confFileMap.get(fileName).getCls().toString())) + ", Second: ") + (disconfCenterFile.toString())));
    }else {
        confFileMap.put(fileName, disconfCenterFile);
    }
}