@org.testng.annotations.Test
public void testDeleteContact() {
    int index = smartContactChoosing();
    com.example.utilits.SortedListOf<com.example.tests.ObjContact> beforeTestingContacts = app.getContactHelper().getContactsList();
    int idContact = app.getContactHelper().getIdContact(index);
    app.getContactHelper().clickEditContact(idContact).clickDeleteContact();
    com.example.utilits.SortedListOf<com.example.tests.ObjContact> afterTestingContacts = app.getContactHelper().getContactsList();
    org.junit.Assert.assertThat(afterTestingContacts, equalTo(beforeTestingContacts.without(index)));
}