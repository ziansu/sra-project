@java.lang.Override
public void addSubjectsToDataBase(java.util.ArrayList<java.lang.String> subjectList) {
    database.addSubject("None", chooseNewColor());
    for (int i = 0; i < (subjectList.size()); i++) {
        database.addSubject(subjectList.get(i), chooseNewColor());
    }
}