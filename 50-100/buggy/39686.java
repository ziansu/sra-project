public static boolean isDossierChange(long dossierId) {
    boolean isChange = false;
    if (dossierId != 0) {
        try {
            org.opencps.processmgt.model.ProcessOrder processOrder = org.opencps.processmgt.service.ProcessOrderLocalServiceUtil.getProcessOrder(dossierId, 0);
            java.lang.String dossierStatus = processOrder.getDossierStatus();
            org.opencps.backend.util.BackendUtils._log.info((("DOSSIERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + dossierStatus) + dossierId));
            if (com.liferay.portal.kernel.util.Validator.equals(dossierStatus, PortletConstants.DOSSIER_STATUS_DONE)) {
                isChange = true;
            }
        } catch (java.lang.Exception e) {
            org.opencps.backend.util.BackendUtils._log.error(e);
        }
    }
    return isChange;
}