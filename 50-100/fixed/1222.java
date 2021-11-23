@io.qameta.allure.Description(value = "The test checks that user can select all in table and delete them")
@org.testng.annotations.Test
public void userDeletionAllTest() {
    usersPage.createNewUser("testName", "fullName", "");
    usersPage.createNewUser("nameTest", "nameFull", "");
    usersPage.deleteAllusers();
    org.testng.Assert.assertEquals(usersPage.countAllElementsInTable(), 1);
    org.testng.Assert.assertTrue(usersPage.checkElementPresentInTable("Empty"));
}