@org.junit.Test
public void testFindByExample() {
    testPersist();
    com.pos.system.model.TblEmployee employee = new com.pos.system.model.TblEmployee();
    employee.setStrSurname("Mustermann");
    java.util.ArrayList<com.pos.system.model.TblEmployee> exampleEmployees = ((java.util.ArrayList<com.pos.system.model.TblEmployee>) (com.pos.system.test.DBAccessTest.employeeDao.findByExample(employee)));
    for (com.pos.system.model.TblEmployee tblEmployee : exampleEmployees) {
        org.junit.Assert.assertThat(tblEmployee.getStrSurname(), org.hamcrest.CoreMatchers.is("Mustermann"));
    }
}