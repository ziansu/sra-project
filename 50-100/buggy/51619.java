public void it(org.forgerock.cuppa.model.Behaviour behaviour, java.lang.String description, java.util.Optional<org.forgerock.cuppa.functions.TestFunction> function, org.forgerock.cuppa.model.Options options) {
    assertNotRunningTests("it");
    assertNotRootDescribeBlock("it", "when", "describe");
    getCurrentDescribeBlock().addTest(new org.forgerock.cuppa.model.Test(behaviour, testClass, description, function, options));
}