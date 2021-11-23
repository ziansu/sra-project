private void parseRequiredHeaderClaimUris(org.apache.axiom.om.OMElement requiredClaimUrisElem) {
    if (requiredClaimUrisElem == null) {
        return ;
    }
    java.util.Iterator claimUris = requiredClaimUrisElem.getChildrenWithLocalName(org.wso2.carbon.apimgt.keymgt.handlers.ExtendedPasswordGrantHandler.CLAIM_URI);
    if (claimUris != null) {
        while (claimUris.hasNext()) {
            org.apache.axiom.om.OMElement claimUri = ((org.apache.axiom.om.OMElement) (claimUris.next()));
            if (claimUri != null) {
                requiredHeaderClaimUris.add(claimUri.getText());
            }
        } 
    }
}