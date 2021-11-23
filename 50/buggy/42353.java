private void setSnapshotIdAndGroupId(com.samsung.sec.dexter.core.analyzer.AnalysisConfig config) {
    if ("SNAPSHOT".equals(projectCfg.getType())) {
        config.setNoDefectGroupAndSnapshotId();
        config.setSnapshotId(java.lang.System.currentTimeMillis());
    }
}