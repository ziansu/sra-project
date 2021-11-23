@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<com.projectk.model.entity.Employee> getAllEmployeesByName(java.lang.String employeeName) {
    java.lang.String query = ("SELECT e FROM Employee e WHERE e.name like '%" + employeeName) + "%'";
    java.util.List<com.projectk.model.entity.Employee> employees = hibernateUtil.fetchAll(query);
    return employees;
}