private void changeActionBarColor() {
    getActionBar().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getColors()[com.hkm.sampleswipe.DemoActivity.mBgIndex]));
    (com.hkm.sampleswipe.DemoActivity.mBgIndex)++;
    if ((com.hkm.sampleswipe.DemoActivity.mBgIndex) >= (getColors().length)) {
        com.hkm.sampleswipe.DemoActivity.mBgIndex = 0;
    }
}