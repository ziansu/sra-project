public int addSubject(dataObjects.Subject subject) {
    int id = getAvailablaId();
    subject.setId(id);
    subjectsList.add(subject);
    return id;
}