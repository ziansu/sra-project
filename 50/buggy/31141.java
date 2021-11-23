public void updateStudents(java.lang.String[] students, java.lang.String course) {
    jdbcTemplate.update("UPDATE courses SET students=? WHERE title=? ", students, course);
}