public com.sciaps.common.spectrum.LIBZPixelSpectrum getShot(java.lang.String testId, int shotNum) {
    final com.sciaps.common.swing.global.CalibrationShotManager.Key key = new com.sciaps.common.swing.global.CalibrationShotManager.Key(testId, shotNum);
    com.sciaps.common.spectrum.LIBZPixelSpectrum retval = mMemoryStore.get(key);
    if (retval == null) {
        try {
            retval = mCache.get(key);
        } catch (java.lang.Exception e) {
        }
    }
    return retval;
}