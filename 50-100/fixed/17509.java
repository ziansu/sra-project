@java.lang.Override
public void verify(com.talvish.tales.auth.jwt.JsonWebToken theToken, com.talvish.tales.auth.accesscontrol.AccessResult theResult) {
    com.talvish.tales.auth.capabilities.Capabilities tokenCapabilities = ((com.talvish.tales.auth.capabilities.Capabilities) (theToken.getClaims().get(claim)));
    if (tokenCapabilities == null) {
        theResult.setResult(AccessStatus.MISSING_CLAIM, "claim '%s' is missing", claim);
    }else
        if (!(tokenCapabilities.hasCapability(capabilityIndex))) {
            theResult.setResult(AccessStatus.MISSING_CAPABILITIES, "capability '%s.%s' (index '%s') is missing from claim '%s'", family, capabilityName, capabilityIndex, claim);
        }else {
            theResult.setResult(AccessStatus.VERIFIED);
        }
    
}