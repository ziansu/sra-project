void verifywsActionCorrectForValidationContext(java.lang.String wsaction) {
    gov.nist.toolkit.valsupport.client.ValidationContext v = gov.nist.toolkit.valsupport.engine.DefaultValidationContextFactory.validationContext();
    v.clone(vc);
    gov.nist.toolkit.validatorsSoapMessage.message.SoapMessageValidator.setValidationContextFromWSAction(v, wsaction);
    java.lang.String expected = "foo";
    if (!(v.equals(vc))) {
        er.error("???", "Expected WS:Action", wsaction, expected, "???");
    }
}