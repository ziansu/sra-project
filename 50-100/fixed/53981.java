public boolean apply(fr.istic.iodeman.model.Unavailability a) {
    fr.istic.iodeman.model.Person p = a.getPerson();
    return ((p.equals(participant.getStudent())) || (p.equals(participant.getFollowingTeacher()))) && ((p.getRole()) == (nextPriority.getRole()));
}