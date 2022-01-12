@java.lang.Override
public void onMessage(javax.jms.Message message) {
    if (coreProperties.isMpiEnabled()) {
        org.openmrs.api.context.Context.openSession();
        try {
            performMpiAction(message);
        } finally {
            org.openmrs.api.context.Context.closeSession();
        }
    }
}