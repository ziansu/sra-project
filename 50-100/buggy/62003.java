public static org.cote.accountmanager.beans.SecurityBean getSymmetricKeyByObjectId(java.lang.String id, long organizationId) {
    org.cote.accountmanager.beans.SecurityBean bean = null;
    try {
        org.cote.accountmanager.objects.SecurityType sec = ((org.cote.accountmanager.data.factory.SymmetricKeyFactory) (org.cote.accountmanager.data.Factories.getFactory(FactoryEnumType.SYMMETRICKEY))).getByObjectId(id, organizationId);
        if (sec != null)
            bean = org.cote.accountmanager.data.security.KeyService.promote(sec);
        
    } catch (org.cote.accountmanager.data.FactoryException e) {
        org.cote.accountmanager.data.security.KeyService.logger.error("Error", e);
    } catch (org.cote.accountmanager.data.ArgumentException e) {
        org.cote.accountmanager.data.security.KeyService.logger.error("Error", e);
    }
    return bean;
}