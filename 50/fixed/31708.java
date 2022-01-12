@org.junit.Test
public void testCheckAliasFromContactListShouldReturnHappy() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.ContactPerson> contactPeople = new java.util.ArrayList<>();
    un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.ContactPerson contactPerson = new un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.ContactPerson();
    contactPeople.add(contactPerson);
    assertTrue(fact.checkAliasFromContactList(contactPeople, true));
}