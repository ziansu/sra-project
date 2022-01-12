protected void onEnable() {
    if (builder.isPaused()) {
        builder.resume();
    }
}