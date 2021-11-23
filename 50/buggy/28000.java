@java.lang.Override
public java.util.List<com.cooperate.entity.Person> getPersons(java.lang.String fio) {
    if ((fio != null) && (!(fio.isEmpty()))) {
        personDAO.findByPersonfio(fio);
    }
    return personDAO.findTop30By();
}