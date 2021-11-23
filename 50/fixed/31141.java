public void updateStudents(java.lang.String tmp, java.lang.String course) {
    jdbcTemplate.update("UPDATE courses SET students=? WHERE title=? ", tmp, course);
}