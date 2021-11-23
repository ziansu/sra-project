@java.lang.Override
public java.util.List<com.example.domain.Person> find() {
    java.util.List<com.example.domain.Person> persons = this.jdbcTemplate.query("select * from person", new com.example.dao.PersonDaoImpl.PersonMapper());
    com.example.dao.PersonDaoImpl.log.info((("Found " + (persons.size())) + " persons"));
    return persons;
}