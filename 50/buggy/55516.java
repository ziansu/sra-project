private void printInfo(final java.lang.String info) {
    gameactivity.runOnUiThread(() -> {
        gameactivity.setStatus(info);
    });
}