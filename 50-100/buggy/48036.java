@javax.annotation.Nonnull
public static com.helger.as4.model.pmode.PMode getTestPMode(@javax.annotation.Nonnull
final com.helger.as4.soap.ESOAPVersion eSOAPVersion) {
    final com.helger.as4.model.pmode.PMode aConfig = new com.helger.as4.model.pmode.PMode(com.helger.as4.server.MockPModeGenerator._generateInitiatorOrResponder(true), com.helger.as4.server.MockPModeGenerator._generateInitiatorOrResponder(false), com.helger.as4.mock.MockEbmsHelper.DEFAULT_AGREEMENT, com.helger.as4.model.EMEP.ONE_WAY, com.helger.as4.model.EMEPBinding.PUSH, com.helger.as4.server.MockPModeGenerator._generatePModeLeg(eSOAPVersion), null, null, null);
    return aConfig;
}