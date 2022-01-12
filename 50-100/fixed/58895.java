private static android.content.ContentValues getContentValues(com.alvinsvitzer.blamegame.model.Crime crime) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(CrimeTable.Cols.UUID, crime.getId().toString());
    values.put(CrimeTable.Cols.TITLE, crime.getTitle());
    values.put(CrimeTable.Cols.DATE, crime.getDate().getTime());
    values.put(CrimeTable.Cols.SOLVED, (crime.isSolved() ? 1 : 0));
    values.put(CrimeTable.Cols.SUSPECT, crime.getSuspect());
    return values;
}