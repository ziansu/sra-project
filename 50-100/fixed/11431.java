@java.lang.Override
public org.openntf.domino.NotesCalendar getCalendar(final org.openntf.domino.Database db) {
    try {
        return fromLotus(getDelegate().getCalendar(toLotus(db)), NotesCalendar.SCHEMA, this);
    } catch (lotus.domino.NotesException e) {
        org.openntf.domino.utils.DominoUtils.handleException(e, this);
        return null;
    }
}