@org.junit.Test
public void testCase3_5() throws java.lang.Exception {
    java.lang.String input = new com.hcmut.smarthome.utils.ScriptBuilder().begin().If(com.hcmut.smarthome.service.test.ScenarioValidatorTest.TSENSOR_5, com.hcmut.smarthome.utils.ConstantUtil.NOT_EQUAL, 35.5F).If(com.hcmut.smarthome.service.test.ScenarioValidatorTest.TSENSOR_5, com.hcmut.smarthome.utils.ConstantUtil.EQUAL, 34).action(com.hcmut.smarthome.utils.ConstantUtil.TURN_OFF, com.hcmut.smarthome.service.test.ScenarioValidatorTest.LIGHT_2).endIf().endIf().end().build();
    java.util.List<java.lang.String> existedScritps = new java.util.ArrayList<>();
    boolean expectedResult = true;
    runTestScriptValidation(input, existedScritps, expectedResult);
}