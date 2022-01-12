public static void appendLog(float log) {
    if (ui.GlanetRunner.args[CommandLineArguments.DebugMode.value()].equalsIgnoreCase(Commons.ARG_DEBUG_MODE)) {
        if ((ui.GlanetRunner.getMainView()) == null)
            java.lang.System.out.println(log);
        else
            ui.GlanetRunner.getMainView().appendNewTextToLogArea(log);
        
    }
}