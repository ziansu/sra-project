public int updateStudent(com.carpool.model.Student student) {
    return jdbcTemplate.update(UPDATE, new java.lang.Object[]{ student.getFirstName() , student.getLastName() , student.getIdStudent() , student.getEmail() , student.isDriver() , student.isRider() });
}