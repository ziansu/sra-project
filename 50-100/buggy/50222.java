public com.example.hemuc_000.criminalintent.Crime getCrime(java.util.UUID id) {
    com.example.hemuc_000.criminalintent.database.CrimeCursorWrapper cursor = queryCrimes(((CrimeTable.Cols.UUID) + " = ?"), new java.lang.String[]{ id.toString() });
    try {
        if ((cursor.getCount()) == 0) {
            return null;
        }
        cursor.moveToFirst();
        return cursor.getCrime();
    } finally {
        cursor.close();
    }
}