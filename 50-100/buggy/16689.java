public static void updateParticipationInContactsEvent(java.lang.String ID_wh, int ID_contact, boolean isParticipated) {
    int val;
    if (isParticipated) {
        val = 1;
    }else
        val = 0;
    
    com.logivations.w2mo.ui.enums.dbe.QueriesCRM.jdbcTemplate.execute(((((((com.logivations.w2mo.ui.enums.dbe.QueriesCRM.getQuery(com.logivations.w2mo.ui.enums.dbe.QueriesCRM.UPDATE_PARTICIPATION_IN_CONTACTS_EVENT)) + val) + " where ID_contact='") + ID_contact) + "' and ID_wh=") + ID_wh));
}