@org.junit.Test
public void testCreateEmployee() {
    com.trinet.jpa.entity.EmployeeJpa employeeJpa = createEmployee();
    org.junit.Assert.assertNull(employeeJPADao.findOne(employeeJpa.getEmpId()));
    employeeJPADao.save(employeeJpa);
    org.junit.Assert.assertNotNull(employeeJPADao.findEmployeeByEmpId(employeeJpa.getEmpId()));
}