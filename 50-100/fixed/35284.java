private java.util.List<seedu.addressbook.data.person.ReadOnlyPerson> getPersonsWithNameContainingPhoneNumber(java.util.List<java.lang.Integer> inclusiveTerms, java.util.List<java.lang.Integer> exclusiveTerms) {
    final java.util.List<seedu.addressbook.data.person.ReadOnlyPerson> matchedPersons = new java.util.ArrayList<>();
    for (seedu.addressbook.data.person.ReadOnlyPerson person : addressBook.getAllPersons()) {
        if (checkPersonPhoneNumberAgainstSequencesInList(person, exclusiveTerms))
            continue;
        
        if (checkPersonPhoneNumberAgainstSequencesInList(person, inclusiveTerms))
            matchedPersons.add(person);
        
    }
    return matchedPersons;
}