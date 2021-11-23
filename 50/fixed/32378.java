private org.talend.core.runtime.hd.IDistributionsManager getDistributionsManager() {
    if (((types) != null) && ((types.length) == 1)) {
        return org.talend.core.hadoop.version.custom.HadoopVersionControlUtils.getDistributionsManager(types[0]);
    }
    return org.talend.core.hadoop.version.custom.HadoopVersionControlUtils.getDistributionsManager(null);
}