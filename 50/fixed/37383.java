private void changeActionBarColor() {
    (com.hkm.sampleswipe.DemoActivity.mBgIndex)++;
    if ((com.hkm.sampleswipe.DemoActivity.mBgIndex) >= (getColors().length)) {
        com.hkm.sampleswipe.DemoActivity.mBgIndex = 0;
    }
}