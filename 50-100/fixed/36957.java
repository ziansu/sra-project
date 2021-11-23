private static java.util.List<java.lang.String> executeCommand(java.lang.String cmd) {
    try {
        pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.logger.info(("executing command: " + cmd));
        java.util.List<java.lang.String> result = pt.ulisboa.tecnico.amorphous.requestrouter.utils.SystemShell.executeCommand(cmd);
        for (java.lang.String rline : result)
            pt.ulisboa.tecnico.amorphous.requestrouter.lvs.LVSImplementation.logger.info(rline);
        
        return result;
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
        return null;
    }
}