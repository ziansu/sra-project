@java.lang.Override
public boolean solve(final java.lang.String noteId) throws de.inselhome.noteapp.exception.PersistenceException {
    if (com.google.common.base.Strings.isNullOrEmpty(noteId)) {
        return false;
    }else {
        final de.inselhome.noteapp.domain.Note note = com.google.common.collect.Iterables.find(cache, new com.google.common.base.Predicate<de.inselhome.noteapp.domain.Note>() {
            @java.lang.Override
            public boolean apply(de.inselhome.noteapp.domain.Note input) {
                return noteId.equals(input.getId());
            }
        });
        note.setSolvedAt(new java.util.Date());
        persistenceProvider.save(note);
        return true;
    }
}