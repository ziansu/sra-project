public static float getCpuData(java.lang.String sn, java.lang.String packageName, int CpuIndex) {
    java.lang.String TOP_CPUINFO = (("/Users/monkey/Documents/dev_tool/adt-bundle-mac-x86_64-20140702/sdk/platform-tools/adb -s " + sn) + " shell top | grep ") + packageName;
    java.lang.String cpuInfo = ADBShell.sendADB(TOP_CPUINFO, 5000);
    float cpuData = CpuInfo.getTotalCPUInfo(sn, cpuInfo, CpuIndex);
    return cpuData;
}