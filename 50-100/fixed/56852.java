private com.colorado.denver.model.Role createRole(java.lang.String name) {
    com.colorado.denver.test.DenverDBSetupTest.LOGGER.info("Creating new Role in Database CREATE! If you try to create roles during 'update' YOU'LL FUCK EVERYTHING UP");
    com.colorado.denver.test.DenverDBSetupTest.LOGGER.info("Database Update mode not supported. (DIY)");
    com.colorado.denver.model.Role role = new com.colorado.denver.model.Role();
    role.setRoleName(name);
    com.colorado.denver.controller.HibernateController hibCtrl = com.colorado.denver.services.persistence.HibernateGeneralTools.getHibernateController();
    hibCtrl.addEntity(role);
    return role;
}