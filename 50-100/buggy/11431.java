@java.lang.Override
public org.openntf.domino.NotesCalendar getCalendar(final org.openntf.domino.Database db) {
    try {
        org.openntf.domino.Database parentDb = null;
        if (db instanceof org.openntf.domino.Database) {
            parentDb = ((org.openntf.domino.Database) (db));
        }else {
            parentDb = fromLotus(db, Database.SCHEMA, this);
        }
        return fromLotus(getDelegate().getCalendar(toLotus(db)), NotesCalendar.SCHEMA, parentDb);
    } catch (lotus.domino.NotesException e) {
        org.openntf.domino.utils.DominoUtils.handleException(e, this);
        return null;
    }
}