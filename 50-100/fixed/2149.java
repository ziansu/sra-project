@org.junit.Test
public void testFindById() {
    com.pos.system.model.TblEmployee employee = com.pos.system.test.DBAccessTest.employeeDao.findById(1);
    org.junit.Assert.assertThat(employee.getIntId(), org.hamcrest.CoreMatchers.is(1));
    org.junit.Assert.assertThat(employee.getStrGivenName(), org.hamcrest.CoreMatchers.is("Max"));
    org.junit.Assert.assertThat(employee.getStrSurname(), org.hamcrest.CoreMatchers.is("Mustermann"));
}