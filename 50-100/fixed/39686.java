public static boolean isDossierChange(long dossierId) {
    boolean isChange = false;
    if (dossierId != 0) {
        try {
            org.opencps.processmgt.model.ProcessOrder processOrder = org.opencps.processmgt.service.ProcessOrderLocalServiceUtil.getProcessOrder(dossierId, 0);
            java.lang.String dossierStatus = processOrder.getDossierStatus();
            if (com.liferay.portal.kernel.util.Validator.equals(dossierStatus, PortletConstants.DOSSIER_STATUS_DONE)) {
                isChange = true;
            }
        } catch (java.lang.Exception e) {
        }
    }
    return isChange;
}