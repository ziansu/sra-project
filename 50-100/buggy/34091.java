@javax.annotation.Nonnull
private static com.helger.as4.model.pmode.leg.PModeLeg _generatePModeLeg(@javax.annotation.Nonnull
final com.helger.as4.soap.ESOAPVersion eSOAPVersion) {
    final com.helger.as4.model.pmode.leg.PModeLegReliability aPModeLegReliability = null;
    final com.helger.as4.model.pmode.leg.PModeLegSecurity aPModeLegSecurity = null;
    return new com.helger.as4.model.pmode.leg.PModeLeg(com.helger.as4.server.MockPModeGenerator._generatePModeLegProtocol(eSOAPVersion), com.helger.as4.server.MockPModeGenerator._generatePModeLegBusinessInformation(), com.helger.as4.server.MockPModeGenerator._generatePModeLegErrorHandling(), aPModeLegReliability, aPModeLegSecurity);
}