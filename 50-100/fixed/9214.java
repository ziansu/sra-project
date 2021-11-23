protected javax.xml.bind.JAXBElement<org.oscm.saml2.api.model.protocol.LogoutRequestType> signLogoutRequest(javax.xml.bind.JAXBElement<org.oscm.saml2.api.model.protocol.LogoutRequestType> logoutRequestJAXB) {
    try {
        org.w3c.dom.Element marshaled = marshallJAXBElement(logoutRequestJAXB);
        org.w3c.dom.Element signed = samlBean.signLogoutRequest(marshaled);
        logoutRequestJAXB = unmarshallJAXBElement(signed);
    } catch (java.lang.Exception e) {
        throw new org.oscm.internal.types.exception.SaaSSystemException(e);
    }
    return logoutRequestJAXB;
}