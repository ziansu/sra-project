@java.lang.Override
public void onSuccess(edu.caltech.cs141b.hw2.gwt.collab.shared.UnlockedDocument result) {
    collaborator.statusUpdate((("Document '" + (edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.shortenText(result.getTitle(), edu.caltech.cs141b.hw2.gwt.collab.client.DocSaver.maxStrLen))) + "' successfully saved."));
    collaborator.setDoc(result, index, side);
    collaborator.lister.getDocumentList(false);
}