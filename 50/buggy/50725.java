@java.lang.Override
public void truncateTable() throws org.springframework.dao.DataAccessException {
    java.lang.String SQL = "delete from users";
    jdbcTemplateObject.update(SQL);
    return ;
}