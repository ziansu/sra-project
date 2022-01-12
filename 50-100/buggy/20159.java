@org.junit.Test
public void create() throws java.lang.Exception {
    pl.sda.domain.Department department = new pl.sda.domain.Department(99, "HR", "Las Vegas");
    deptDAO.create(department);
    pl.sda.domain.Department departmentFromDb = deptDAO.findById(99);
    assertNotNull(departmentFromDb);
    assertEquals(department.getDeptno(), departmentFromDb.getDeptno());
    assertEquals(department.getDname(), departmentFromDb.getDname());
    assertEquals(department.getLocation(), departmentFromDb.getLocation());
}