public static boolean add(final model.Alumni theAlumni) {
    if ((model.AlumniCollection.mAlumniDB) == null) {
        model.AlumniCollection.mAlumniDB = new data.AlumniDB();
    }
    try {
        model.AlumniCollection.mAlumniDB.addAlumni(theAlumni);
        return true;
    } catch (final java.io.IOException e) {
        e.printStackTrace();
    }
    return false;
}