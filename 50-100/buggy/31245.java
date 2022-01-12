@org.junit.Test
public void testDelete() {
    hu.elte.projekteszkozok.dto.NoteDTO dto = noteService.delete(noteId);
    assertEquals(strings[0], dto.getContent());
    assertEquals(strings[1], dto.getTitle());
    assertTrue(now.before(dto.getLastModified()));
    assertNull(noteService.getById(noteId));
}