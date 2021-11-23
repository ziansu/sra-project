public void handleOk() {
    if (checkPrefs()) {
        savePrefs();
        stage.close();
    }
}