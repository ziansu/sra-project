@java.lang.Override
protected void configure() {
    install(new de.prob.MainModule());
    bind(de.prob2.ui.states.ClassBlacklist.class);
    bind(java.util.ResourceBundle.class).toInstance(bundle);
    bind(de.prob.scripting.ScriptEngineProvider.class);
    bind(de.prob2.ui.history.HistoryView.class);
    bind(de.prob2.ui.menu.MenuController.class);
    bind(de.prob2.ui.modelchecking.ModelcheckingController.class);
    bind(de.prob2.ui.modeline.ModelineController.class);
    bind(de.prob2.ui.operations.OperationsView.class);
    bind(de.prob2.ui.states.StatesView.class);
    bind(de.prob2.ui.animations.AnimationsView.class);
}