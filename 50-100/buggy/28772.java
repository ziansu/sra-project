@java.lang.Override
public boolean isEmployeeExist(springcommunity.demo.hrmsystem.domain.Employee e) {
    java.lang.String sql = "SELECT * FROM Employee WHERE Phone=:phone OR Email=:email";
    org.springframework.jdbc.core.namedparam.MapSqlParameterSource paramMap = new org.springframework.jdbc.core.namedparam.MapSqlParameterSource();
    paramMap.addValue("phone", e.getPhone());
    paramMap.addValue("email", e.getEmail());
    org.springframework.jdbc.core.RowMapper<springcommunity.demo.hrmsystem.domain.Employee> rm = new springcommunity.demo.hrmsystem.dao.EmployeeRowMapper();
    try {
        jdbcTemplate.queryForObject(sql, paramMap, rm);
        return true;
    } catch (org.springframework.dao.DataAccessException e1) {
        java.lang.System.out.println(("This employee is not exist cause" + e));
        return false;
    }
}