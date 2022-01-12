public static void appendLog(int log) {
    if (((ui.GlanetRunner.getMainView()) == null) && (ui.GlanetRunner.args[CommandLineArguments.DebugMode.value()].equalsIgnoreCase(Commons.ARG_DEBUG_MODE)))
        java.lang.System.out.println(log);
    else
        ui.GlanetRunner.getMainView().appendNewTextToLogArea(log);
    
}