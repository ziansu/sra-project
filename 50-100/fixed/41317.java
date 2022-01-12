public static java.lang.Object[] getDegreeTrack() {
    if ((model.AlumniCollection.mAlumniDB) == null) {
        model.AlumniCollection.mAlumniDB = new data.AlumniDB();
    }
    try {
        return model.AlumniCollection.mAlumniDB.getDegreeTrack();
    } catch (final java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}