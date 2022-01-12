private static com.cburch.logisim.proj.Project completeProject(com.cburch.logisim.gui.start.SplashScreen monitor, com.cburch.logisim.file.Loader loader, com.cburch.logisim.file.LogisimFile file, boolean isStartup) {
    if (monitor != null)
        monitor.setProgress(SplashScreen.PROJECT_CREATE);
    
    com.cburch.logisim.proj.Project ret = new com.cburch.logisim.proj.Project(file);
    if (monitor != null)
        monitor.setProgress(SplashScreen.FRAME_CREATE);
    
    javax.swing.SwingUtilities.invokeLater(new com.cburch.logisim.proj.ProjectActions.CreateFrame(loader, ret, isStartup));
    com.cburch.logisim.proj.ProjectActions.updatecircs(ret.getLogisimFile(), ret);
    return ret;
}