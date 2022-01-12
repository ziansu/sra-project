public void saveModules() {
    if ((moduleStore) != null) {
        moduleStore.setItem("modules", moduleList.toJSONString());
    }
}