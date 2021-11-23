public int updateStudent(com.carpool.model.Student student) {
    return jdbcTemplate.update(UPDATE, student.getFirstName(), student.getLastName(), student.getEmail(), (student.isDriver() ? 1 : 0), (student.isRider() ? 1 : 0), student.getIdStudent());
}