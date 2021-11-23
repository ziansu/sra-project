public static org.cote.accountmanager.beans.SecurityBean getPrimarySymmetricKey(org.cote.accountmanager.objects.UserType user) {
    org.cote.accountmanager.beans.SecurityBean bean = null;
    try {
        org.cote.accountmanager.objects.SecurityType sec = ((org.cote.accountmanager.data.factory.SymmetricKeyFactory) (org.cote.accountmanager.data.Factories.getFactory(FactoryEnumType.SYMMETRICKEY))).getPrimaryPersonalKey(user);
        if (sec != null)
            bean = org.cote.accountmanager.data.security.KeyService.promote(sec);
        
    } catch (org.cote.accountmanager.data.FactoryException | org.cote.accountmanager.data.ArgumentException e) {
        org.cote.accountmanager.data.security.KeyService.logger.error("Error", e);
    }
    return bean;
}