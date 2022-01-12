@java.lang.Override
@florian_haas.lucas.business.RequiresPermissions(value = USER_SET_VALID_DATE)
public java.lang.Boolean setValidDate(java.lang.Long userCardId, java.time.LocalDate validDate) {
    florian_haas.lucas.business.UserCard userCard = userCardDao.findById(userCardId);
    if ((((userCard.getValidDay()) != null) && (userCard.getValidDay().equals(validDate))) || (((userCard.getValidDay()) == null) && (validDate == null)))
        return java.lang.Boolean.FALSE;
    
    userCard.setValidDay(validDate);
    return java.lang.Boolean.TRUE;
}