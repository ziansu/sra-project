public void addSearchEngines(final java.util.ArrayList<io.github.maddouri.intellij.OnlineSearch.state.PluginSettings.SearchEngine> searchEngines) {
    for (io.github.maddouri.intellij.OnlineSearch.state.PluginSettings.SearchEngine engine : searchEngines) {
        addSearchEngineEntry(engine.name, engine.url);
    }
    this.setModified(true);
}