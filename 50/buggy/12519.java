public static synchronized void init(android.content.ContentResolver resolver) {
    if ((com.robotoworks.mechanoid.db.SQuery.mAsync) != null) {
        com.robotoworks.mechanoid.db.SQuery.mAsync = new com.robotoworks.mechanoid.db.SQuery.Async(resolver);
    }
}