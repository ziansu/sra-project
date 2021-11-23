public void exit() {
    for (int i = (serverConfigList.size()) - 1; i > 0; --i) {
        if ((serverConfigList.get(i).getDeleted()) == "true") {
            serverConfigList.remove(i);
        }
    }
    saveSettings();
}