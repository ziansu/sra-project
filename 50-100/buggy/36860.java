public static java.util.List<model.Alumni> getAlumni() {
    if ((model.AlumniCollection.mAlumniDB) == null) {
        model.AlumniCollection.mAlumniDB = new data.AlumniDB();
    }
    try {
        return model.AlumniCollection.mAlumniDB.getAllAlumni();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}