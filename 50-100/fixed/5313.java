public static seedu.address.model.ReadOnlyAddressBook getSampleAddressBook() {
    try {
        seedu.address.model.AddressBook sampleAb = new seedu.address.model.AddressBook();
        seedu.address.model.property.PropertyManager.initializePropertyManager();
        for (seedu.address.model.person.Person samplePerson : seedu.address.model.util.SampleDataUtil.getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    } catch (seedu.address.model.person.exceptions.DuplicatePersonException e) {
        throw new java.lang.AssertionError("sample data cannot contain duplicate persons", e);
    }
}