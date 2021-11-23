protected void assertEqualDepartment(com.eswaraj.web.dto.DepartmentDto expectedDepartment, com.eswaraj.web.dto.DepartmentDto actualDepartment, boolean checkId) {
    if (checkId) {
        org.junit.Assert.assertEquals(expectedDepartment.getId(), actualDepartment.getId());
    }
    org.junit.Assert.assertEquals(expectedDepartment.getDescription(), actualDepartment.getDescription());
    org.junit.Assert.assertEquals(expectedDepartment.getName(), actualDepartment.getName());
}