static java.util.List<miro.shared.Assignment> builFinalAssignmentList(java.util.List<miro.shared.Person> personList, java.util.List<miro.shared.Assignment> assignmentList) {
    for (miro.shared.Assignment assignment : assignmentList) {
        miro.shared.Person assignedPerson = assignment.getPerson();
        if (personList.contains(assignedPerson)) {
            int index = personList.indexOf(assignedPerson);
            miro.shared.Person retrievedPerson = personList.get(index);
            assignment.setPerson(retrievedPerson);
        }
    }
    java.util.Collections.sort(assignmentList, new miro.shared.Assignment.OrderByName());
    return assignmentList;
}