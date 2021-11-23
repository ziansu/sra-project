public static void execute(final de.fraunhofer.iosb.tc_lib.TcParamTmr tcParam) {
    final de.fraunhofer.iosb.tc_lib.IVCT_RTIambassador ivct_FederateAmbassador = de.fraunhofer.iosb.tc_lib.IVCT_RTI_Factory.getIVCT_RTI(de.fraunhofer.iosb.tc.TC00002.logger);
    final de.fraunhofer.iosb.tc_lib.TcBaseModel baseModelTc = new de.fraunhofer.iosb.tc_lib.TcBaseModel(de.fraunhofer.iosb.tc.TC00002.logger, ivct_FederateAmbassador);
    final de.fraunhofer.iosb.tc_lib.TcFederateAmbassador tcFederateAmbassador = new de.fraunhofer.iosb.tc_lib.TcFederateAmbassador(baseModelTc, de.fraunhofer.iosb.tc.TC00002.logger);
    de.fraunhofer.iosb.tc.TC00002.logger.info("TEST CASE PREAMBLE");
    baseModelTc.initiateRti(de.fraunhofer.iosb.tc.TC00002.federateName, tcFederateAmbassador, tcParam);
    de.fraunhofer.iosb.tc.TC00002.logger.info("TEST CASE BODY");
    de.fraunhofer.iosb.tc.TC00002.logger.info("TEST CASE POSTAMBLE");
    ivct_FederateAmbassador.terminateRti(tcParam);
}