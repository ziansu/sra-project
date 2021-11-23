public void detectDisplayMode() {
    int dispMode = getResources().getConfiguration().orientation;
    displayMode = (dispMode == 1) ? "" : "_land";
}