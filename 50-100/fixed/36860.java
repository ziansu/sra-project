public static java.util.List<model.Alumni> getAlumni() {
    if ((model.AlumniCollection.mAlumniDB) == null) {
        model.AlumniCollection.mAlumniDB = new data.AlumniDB();
    }
    try {
        return model.AlumniCollection.mAlumniDB.getAllAlumni();
    } catch (final java.sql.SQLException e) {
        e.printStackTrace();
    } catch (final java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (final java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}