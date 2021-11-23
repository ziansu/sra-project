void closeApp() {
    if ((_tmpMedia) != null) {
        _tmpMedia.delete();
    }
    finish();
}