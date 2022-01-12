public static void stopAgentGUI() {
    agentgui.core.application.Application.getJadePlatform().stop();
    if ((agentgui.core.application.Application.getProjectsLoaded().closeAll()) == false)
        return ;
    
    agentgui.core.application.Application.setMainWindow(null);
    agentgui.core.application.Application.getGlobalInfo().getFileProperties().save();
    agentgui.core.application.Language.saveDictionaryFile();
    agentgui.core.application.Application.setTrayIcon(null);
}