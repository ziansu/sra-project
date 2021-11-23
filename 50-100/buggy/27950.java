public static void quit() {
    agentgui.core.application.Application.stopAgentGUI();
    java.lang.System.out.println(agentgui.core.application.Language.translate("Programmende... "));
    agentgui.core.application.Application.setLogFileWriter(null);
    agentgui.core.application.Application.setShutdownThread(null);
    if ((agentgui.core.application.Application.isDoSystemExitOnQuit()) == true) {
        java.lang.System.exit(0);
    }else {
        agentgui.core.application.Application.setQuitJVM(true);
    }
}