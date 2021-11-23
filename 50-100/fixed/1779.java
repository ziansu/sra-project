@org.junit.Test
@org.openflexo.test.TestOrder(value = 4)
public void test3CreateViewFolder() {
    org.openflexo.foundation.action.AddRepositoryFolder addRepositoryFolder = AddRepositoryFolder.actionType.makeNewAction(org.openflexo.foundation.view.TestBasicOntologyEditorView.project.getViewLibrary().getRootFolder(), null, org.openflexo.foundation.view.TestBasicOntologyEditorView.editor);
    addRepositoryFolder.setNewFolderName("NewViewFolder");
    addRepositoryFolder.doAction();
    org.junit.Assert.assertTrue(addRepositoryFolder.hasActionExecutionSucceeded());
    org.openflexo.foundation.view.TestBasicOntologyEditorView.viewFolder = addRepositoryFolder.getNewFolder();
    org.junit.Assert.assertTrue(((java.io.File) (org.openflexo.foundation.view.TestBasicOntologyEditorView.viewFolder.getSerializationArtefact())).exists());
}