@java.lang.Override
protected void createActions() {
    super.createActions();
    final org.eclipse.gef.ui.actions.ActionRegistry registry = getActionRegistry();
    final java.util.List<org.eclipse.jface.action.IAction> actionList = new java.util.ArrayList<org.eclipse.jface.action.IAction>(java.util.Arrays.asList(new org.eclipse.jface.action.IAction[]{ new org.dbflute.erflute.editor.view.action.ermodel.PlaceTableAction(this) , new org.dbflute.erflute.editor.view.action.ermodel.WalkerGroupManageAction(this) }));
    for (final org.eclipse.jface.action.IAction action : actionList) {
        registry.registerAction(action);
    }
}