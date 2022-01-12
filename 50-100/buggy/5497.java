@java.lang.Override
public org.apache.drill.exec.physical.base.ScanStats getScanStats() {
    final org.apache.drill.exec.physical.base.ScanStats nativeHiveScanStats = super.getScanStats();
    return new org.apache.drill.exec.physical.base.ScanStats(nativeHiveScanStats.getGroupScanProperty(), ((nativeHiveScanStats.getRecordCount()) / (HIVE_SERDE_SCAN_OVERHEAD_FACTOR)), ((nativeHiveScanStats.getCpuCost()) / (HIVE_SERDE_SCAN_OVERHEAD_FACTOR)), ((nativeHiveScanStats.getDiskCost()) / (HIVE_SERDE_SCAN_OVERHEAD_FACTOR)));
}