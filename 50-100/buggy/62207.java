public uk.co.alt236.floatinginfo.data.access.generalinfo.inforeader.cpu.CpuData getCpuInfo() {
    final uk.co.alt236.floatinginfo.data.access.generalinfo.inforeader.cpu.CpuData result = new uk.co.alt236.floatinginfo.data.access.generalinfo.inforeader.cpu.CpuData(getTotalCpuUsage());
    for (int i = 0; i < (mCpuInfoList.size()); i++) {
        final uk.co.alt236.floatinginfo.data.access.generalinfo.inforeader.cpu.CpuUtilisationReader.CpuInfo info = mCpuInfoList.get(i);
        result.addCpuUtil(info.getUsage());
    }
    return result;
}