public java.util.List<com.example.ivan.criminalintent.Crime> getCrimes() {
    java.util.List<com.example.ivan.criminalintent.Crime> crimes = new java.util.ArrayList<>();
    com.example.ivan.criminalintent.database.CrimeCursorWrapper cursor = queryCrimes(null, null);
    try {
        cursor.moveToFirst();
        while (cursor.isAfterLast()) {
            crimes.add(cursor.getCrime());
            cursor.moveToNext();
        } 
    } finally {
        cursor.close();
    }
    return crimes;
}