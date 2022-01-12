public java.util.ArrayList<android.database.Cursor> getRandomVocabWords(int setid) {
    int cnt = this.getVocabGroupCount(setid);
    if (cnt <= 0)
        return new java.util.ArrayList<android.database.Cursor>();
    
    java.util.Random random = new java.util.Random();
    return this.getVocabWords(setid, random.nextInt(cnt));
}