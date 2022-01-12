@java.lang.Override
@org.eclipse.e4.core.di.annotations.Execute
public boolean canExecute(org.eclipse.e4.core.contexts.IEclipseContext context) {
    org.testeditor.ui.parts.testExplorer.TestExplorer explorer = ((org.testeditor.ui.parts.testExplorer.TestExplorer) (context.get(TestEditorConstants.TEST_EXPLORER_VIEW)));
    org.testeditor.ui.handlers.CanExecuteTestExplorerHandlerRules rules = org.eclipse.e4.core.contexts.ContextInjectionFactory.make(org.testeditor.ui.handlers.CanExecuteTestExplorerHandlerRules.class, context);
    return (super.canExecute(context)) && ((rules.canExecuteOnTestProjectRule(explorer)) && ((((org.testeditor.core.model.teststructure.TestStructure) (explorer.getSelection().getFirstElement())).getRootElement().getTestProjectConfig().getTeamShareConfig()) == null));
}