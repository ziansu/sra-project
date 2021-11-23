private static double getMadScalingFromPrefs() {
    org.eclipse.jface.preference.IPreferenceStore prefStore = de.mpicbg.tds.knime.hcstools.HCSToolsBundleActivator.getDefault().getPreferenceStore();
    double madScalingFactor = prefStore.getDouble(HCSToolsPreferenceInitializer.MAD_SCALING_FACTOR);
    if (madScalingFactor <= 0) {
        de.mpicbg.tds.knime.hcstools.utils.AttributeStatistics.logger.error("MAD scaling factor has to be greater than 0 (see preference settings)");
    }
    return madScalingFactor;
}