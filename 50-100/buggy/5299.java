public static boolean add(final model.Alumni theAlumni) {
    if ((model.AlumniCollection.mAlumniDB) == null) {
        model.AlumniCollection.mAlumniDB = new data.AlumniDB();
    }
    try {
        model.AlumniCollection.mAlumniDB.addAlumni(theAlumni);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}