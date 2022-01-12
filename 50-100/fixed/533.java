protected void saveConfiguration(java.util.Properties props) {
    try {
        java.lang.String tmpDir = java.lang.System.getProperty("java.io.tmpdir");
        if (tmpDir != null) {
            java.io.File configFile = new java.io.File(tmpDir, stanford.karel.KarelProgram.CONFIG_FILE_NAME);
            props.put("mskarel", java.lang.String.valueOf(msKarelItem.isSelected()));
            java.io.FileOutputStream out = new java.io.FileOutputStream(configFile);
            props.store(out, "Karel configuration file");
            out.close();
        }
    } catch (java.lang.Exception ex) {
    }
}