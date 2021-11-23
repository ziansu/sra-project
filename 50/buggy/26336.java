private void hidePreview() {
    params.width = 0;
    params.height = 0;
    params.alpha = 0.0F;
    try {
        windowManager.updateViewLayout(sv, params);
    } catch (java.lang.IllegalArgumentException e) {
    }
}