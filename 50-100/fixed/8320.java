@org.junit.After
public void tearDown() throws java.lang.Exception {
    try {
        if (org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.isStarted(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER2)) {
            org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.stop(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER2);
        }
    } finally {
        restoreSnapshot(snapshotForServer2);
    }
    try {
        if (org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.isStarted(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER1)) {
            org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.container.stop(org.jboss.as.test.manualmode.messaging.ha.AbstractMessagingHATestCase.SERVER1);
        }
    } finally {
        restoreSnapshot(snapshotForServer1);
    }
}