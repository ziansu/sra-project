private boolean colorPicker(double testSpesification, double totalairflowrate, java.lang.String testBasedOn) {
    if (testBasedOn.equalsIgnoreCase("AHU")) {
        testSpesification += (testSpesification * (mTolarence)) / 100;
    }else {
        testSpesification += testSpesification / 4;
    }
    if (totalairflowrate > testSpesification) {
        return true;
    }else {
        return false;
    }
}