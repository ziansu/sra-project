@java.lang.Override
public void initialize() {
    editor = new edu.stanford.bmir.protege.web.client.ui.obo.OBOTermRelationshipEditor();
    add(editor.getWidget());
}