public static mw.fstraverse.tool.FProcReport newFProcReport(mw.fstraverse.tool.FSPlugins.FS_PLUGIN_TYPE type) {
    return mw.fstraverse.tool.FSPlugins.loadPlugin(type).newFPReport();
}