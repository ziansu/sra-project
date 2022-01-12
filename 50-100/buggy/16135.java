public static java.lang.Boolean isAllAdultsHadMeeting(java.util.List<einbuergerung_Gruppe6.Person> personList) {
    for (einbuergerung_Gruppe6.Person person : personList) {
        if (((person.getRole().equals("applicant")) || (person.getRole().equals("adult"))) && ((person.getMeetingFinished()) == null)) {
            return false;
        }
    }
    return true;
}