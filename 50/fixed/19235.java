@java.lang.Override
public void deleteUser(java.lang.String email) throws org.springframework.dao.DataAccessException {
    java.lang.String SQL = "delete from users where email = ?";
    jdbcTemplateObject.update(SQL, email);
}