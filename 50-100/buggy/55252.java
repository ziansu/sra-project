private void run() {
    if (((attribute1) < 0) && ((attribute2) < 0)) {
        initialSetup();
        cluster();
    }else {
        extractCouple();
        initialSetup();
        printCenters(oldCenter);
        cluster();
    }
}