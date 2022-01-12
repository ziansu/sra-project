public boolean apply(fr.istic.iodeman.model.Unavailability a) {
    fr.istic.iodeman.model.Person p = a.getPerson();
    if (p.equals(participant.getStudent())) {
        java.lang.System.out.println(("match found: " + (p.getId())));
    }
    return ((p.equals(participant.getStudent())) || (p.equals(participant.getFollowingTeacher()))) && ((p.getRole()) == (nextPriority.getRole()));
}