public void load() {
    loadScanConfig();
    try {
        loadMatchConfig();
        loadPitConfig();
        loadBaselineConfig();
        loadFileConfig();
    } catch (org.jdom2.DataConversionException e) {
        e.printStackTrace();
    }
}