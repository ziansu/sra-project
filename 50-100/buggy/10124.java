@java.lang.Override
public void initComponent() {
    io.github.maddouri.intellij.OnlineSearch.state.PluginSettings settings = io.github.maddouri.intellij.OnlineSearch.state.PluginSettings.getInstance();
    com.intellij.openapi.actionSystem.ActionManager am = com.intellij.openapi.actionSystem.ActionManager.getInstance();
    com.intellij.openapi.actionSystem.DefaultActionGroup menuManager = ((com.intellij.openapi.actionSystem.DefaultActionGroup) (am.getAction(io.github.maddouri.intellij.OnlineSearch.action.LaunchSearchActionRegistration.COMPONENT_GROUP)));
    for (io.github.maddouri.intellij.OnlineSearch.state.PluginSettings.SearchEngine engine : settings.searchEngines) {
        io.github.maddouri.intellij.OnlineSearch.action.LaunchSearchAction action = new io.github.maddouri.intellij.OnlineSearch.action.LaunchSearchAction(engine.name, engine.url);
        am.registerAction(io.github.maddouri.intellij.OnlineSearch.action.LaunchSearchActionRegistration.getActionId(action), action);
        menuManager.add(action);
    }
    menuManager.addSeparator();
}