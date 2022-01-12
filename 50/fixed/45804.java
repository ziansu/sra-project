private void disableIME(java.lang.String uuid) {
    users.remove(uuid);
    writeConfig();
}