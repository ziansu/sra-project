@org.junit.Test
public void testGetAllEmployees() {
    org.junit.Assert.assertTrue((!(employeeJpaService.getAllEmployees().isEmpty())));
}