@java.lang.Override
public void initialize() {
    editor = new edu.stanford.bmir.protege.web.client.ui.obo.OBOTermRelationshipEditor();
    editor.setEnabled(true);
    add(editor.getWidget());
}