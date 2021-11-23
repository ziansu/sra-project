@org.junit.jupiter.api.Test
void getNameTest2() {
    core.model.Database.setupDatabase();
    org.junit.jupiter.api.Assertions.assertEquals("Katrina", booking.getEmpName(3));
}