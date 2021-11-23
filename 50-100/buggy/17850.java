@java.lang.Override
public void contextInitialized(javax.servlet.ServletContextEvent arg0) {
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerNewRegistrationHandler();
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerNewAcademicServiceRequestSituationHandler();
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerAcademicServiceRequestCancelOrRejectHandler();
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerStandaloneEnrolmentHandler();
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerExtracurricularEnrolmentHandler();
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerImprovementEnrolmentHandler();
    org.fenixedu.academictreasury.AcademicTreasuryInitializer.registerNormalEnrolmentHandler();
    org.fenixedu.treasury.services.accesscontrol.TreasuryAccessControlAPI.registerExtension(new org.fenixedu.academictreasury.services.accesscontrol.spi.AcademicTreasuryAccessControlExtension());
    org.fenixedu.academictreasury.domain.listeners.DebitEntryDeletionListener.attach();
    org.fenixedu.academictreasury.domain.listeners.ProductDeletionListener.attach();
    final org.fenixedu.academictreasury.domain.treasury.AcademicTreasuryBridgeImpl impl = new org.fenixedu.academictreasury.domain.treasury.AcademicTreasuryBridgeImpl();
    org.fenixedu.academic.domain.treasury.TreasuryBridgeAPIFactory.registerImplementation(impl);
    org.fenixedu.treasury.domain.bennu.signals.BennuSignalsServices.registerSettlementEventHandler(impl);
}