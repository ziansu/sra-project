@org.junit.After
public void tearDown() throws java.lang.Exception {
    if (org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.isStarted(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER1)) {
        org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.stop(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER1);
    }
    restoreSnapshot(snapshotForServer1);
    if (org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.isStarted(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER2)) {
        org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.stop(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER2);
    }
    restoreSnapshot(snapshotForServer2);
}