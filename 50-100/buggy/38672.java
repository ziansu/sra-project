private static java.util.ArrayList<models.Institution> getInstitutionsList(int idCourse) throws android.database.SQLException {
    assert (id) >= 0 : "id must never be negative";
    if (idCourse == 0) {
        return models.Institution.getAll();
    }else {
        return models.Course.get(idCourse).getInstitutions();
    }
}