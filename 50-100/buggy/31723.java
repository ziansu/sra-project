@java.lang.Override
public void contributeToToolBar(org.eclipse.jface.action.IToolBarManager manager) {
    manager.add(org.openlca.app.util.Actions.create("Run", Icon.RUN.descriptor(), () -> {
        if ((org.openlca.app.db.Database.get()) == null) {
            org.openlca.app.util.Info.showBox(M.NoDatabaseOpened, M.NeedOpenDatabase);
            return ;
        }
        org.eclipse.ui.forms.editor.FormEditor editor = org.openlca.app.util.Editors.getActive();
        if (!(editor instanceof org.openlca.app.devtools.IScriptEditor))
            return ;
        
        org.openlca.app.devtools.IScriptEditor scriptEditor = ((org.openlca.app.devtools.IScriptEditor) (editor));
        scriptEditor.evalContent();
    }));
}