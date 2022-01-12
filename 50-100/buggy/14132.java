private static android.content.ContentValues getContentValues(com.svilcata.criminalintent.Crime crime) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(CrimeTable.Cols.UUID, crime.getId().toString());
    values.put(CrimeTable.Cols.TITLE, crime.getTitle().toString());
    values.put(CrimeTable.Cols.DATE, crime.getDate().toString());
    values.put(CrimeTable.Cols.SOLVED, (crime.isSolved() ? 1 : 0));
    return values;
}