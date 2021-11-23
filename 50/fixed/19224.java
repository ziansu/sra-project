@org.junit.BeforeClass
public static void init() {
    alerts = new org.hawkular.alerts.engine.impl.ispn.IspnAlertsServiceImpl();
    alerts.init();
}