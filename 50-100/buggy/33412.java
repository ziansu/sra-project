@java.lang.Override
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED, readOnly = false)
public void addSuperPower(twrog.superhero.dto.SuperPower sp) {
    if (((sp != null) && ((sp.getSuperPowerID()) > 0)) && ((sp.getDescription()) != null)) {
        jdbcTemplate.update(twrog.superhero.dao.SuperPowerDaoJdbcImpl.SQL_INSERT_SUPER_POWER, sp.getDescription());
        int id = jdbcTemplate.queryForObject("select last_insert_id()", java.lang.Integer.class);
        sp.setSuperPowerID(id);
    }
}