@java.lang.Override
public com.github.a2g.core.interfaces.internal.IScenePanelFromScenePresenter createScenePanel(com.github.a2g.core.interfaces.internal.IScenePresenterFromScenePanel scenePres) {
    return new com.github.a2g.core.platforms.html5.panel.ScenePanelForHtml5(bus, master.getScenePresenter(), master.getCommandLinePresenter());
}