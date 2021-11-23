private org.hyperic.sigar.CpuInfo cpuInfo() {
    try {
        org.hyperic.sigar.CpuInfo[] infos = sigar.getCpuInfoList();
        if ((infos == null) | ((infos.length) == 0)) {
            return null;
        }
        return infos[0];
    } catch (org.hyperic.sigar.SigarException e) {
        return null;
    }
}