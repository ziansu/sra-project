public void detectDisplayMode() {
    int dispMode = getResources().getConfiguration().orientation;
    if (dispMode == 1) {
        displayMode = "";
    }else {
        displayMode = "_land";
    }
}