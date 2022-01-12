public void checkAttributeValue(cz.metacentrum.perun.core.api.PerunSession sess, cz.metacentrum.perun.core.api.User user, cz.metacentrum.perun.core.api.Attribute attribute) throws cz.metacentrum.perun.core.api.exceptions.InternalErrorException, cz.metacentrum.perun.core.api.exceptions.WrongAttributeValueException, cz.metacentrum.perun.core.api.exceptions.WrongReferenceAttributeValueException {
    cz.metacentrum.perun.core.implApi.modules.attributes.UserAttributesModuleImplApi attributeModule = getUserAttributeModule(sess, attribute);
    if (attributeModule == null)
        return ;
    
    try {
        attributeModule.checkAttributeValue(((cz.metacentrum.perun.core.impl.PerunSessionImpl) (sess)), user, attribute);
    } catch (cz.metacentrum.perun.core.api.exceptions.WrongAttributeAssignmentException ex) {
        throw new cz.metacentrum.perun.core.api.exceptions.InternalErrorException(ex);
    }
}