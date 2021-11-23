@java.lang.Override
public void delete(com.flxn.dao.model.Atribute object, int userid) {
    if ((exist(object)) && (existOwner(object.getId(), userid))) {
        jdbcTemplate.update(com.flxn.dao.impl.DELETE_ATRIBUTE_BY_ID, new java.lang.Object[]{ object.getId() });
    }else {
        throw new java.lang.UnsupportedOperationException();
    }
}