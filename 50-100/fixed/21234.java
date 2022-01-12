@org.junit.Test
public void testPropertyChangedDeleteNote() {
    org.kore.kolab.notes.local.LocalNotesRepository repo = org.mockito.Mockito.mock(org.kore.kolab.notes.local.LocalNotesRepository.class);
    LocalNotesRepository.PropertyChangeStrategy.DELETE.performChange(repo, "NOTE", EventListener.Type.DELETE, "note", "UID", null);
    org.mockito.Mockito.verify(repo).putEvent("NOTE", EventListener.Type.DELETE);
    org.mockito.Mockito.verify(repo).removeFromNotesCache("UID", "NOTE");
    org.mockito.Mockito.verify(repo, org.mockito.Mockito.times(0)).removeFromNotebookCache("UID");
}