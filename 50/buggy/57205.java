public static mw.fstraverse.tool.FProcReport newFProcReport(mw.fstraverse.tool.FSPlugins.FS_PLUGIN_TYPE type) {
    mw.fstraverse.tool.FProcReport fProcReport = mw.fstraverse.tool.FSPlugins.loadPlugin(type).newFPReport();
    if (fProcReport == null) {
        mw.fstraverse.tool.FSPlugins.logger.severe(("fProcReport is null for " + type));
    }
    return fProcReport;
}