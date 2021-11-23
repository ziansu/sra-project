public boolean dismiss() {
    if (isShowing()) {
        _showCount = 0;
        _showing = false;
        return layout.dismiss();
    }
    return false;
}