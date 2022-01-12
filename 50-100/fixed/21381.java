@org.junit.Test
public void setupDatabase() {
    com.colorado.denver.test.DenverDBSetupTest.LOGGER.info("Creating session factory..");
    com.colorado.denver.services.persistance.SessionTools.createSessionFactory(true);
    com.colorado.denver.test.DenverDBSetupTest.LOGGER.info("Done Creating session factory.");
    com.colorado.denver.controller.HibernateController hibCtrl = com.colorado.denver.services.persistance.HibernateGeneralTools.getHibernateController();
    com.colorado.denver.model.DenverUser systemUser = new com.colorado.denver.model.DenverUser();
    systemUser.setUsername(DenverConstants.SYSTEM);
    hibCtrl.addEntity(systemUser);
}