@org.junit.Test(expected = javax.persistence.PersistenceException.class)
public void createDuplicatedDepartment() throws java.lang.Exception {
    pl.sda.domain.Department department = new pl.sda.domain.Department(99, "HR", "Las Vegas", new java.util.ArrayList<>());
    deptDAO.create(department);
    deptDAO.create(department);
}