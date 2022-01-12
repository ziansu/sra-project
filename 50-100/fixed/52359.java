@org.junit.Test
public void testCreateEmployee() {
    employeeJpa = createEmployee();
    org.junit.Assert.assertNull(employeeJPADao.findOne(employeeJpa.getEmpId()));
    employeeJPADao.save(employeeJpa);
    org.junit.Assert.assertNotNull(employeeJPADao.findEmployeeByEmpId(employeeJpa.getEmpId()));
}