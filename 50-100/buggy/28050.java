public static void main(java.lang.String[] args) {
    osmo.tester.optimizer.multiosmo.MultiOSMO osmo = new osmo.tester.optimizer.multiosmo.MultiOSMO(1365);
    osmo.tester.OSMOConfiguration config = osmo.getConfig();
    config.setFactory(new osmo.mjexamples.gsm.GSMModelFactory(osmo.common.NullPrintStream.stream));
    config.setTestEndCondition(new osmo.tester.generator.endcondition.Length(50));
    config.setSuiteEndCondition(new osmo.tester.generator.endcondition.Length(20));
    osmo.generate(new osmo.tester.generator.endcondition.Time(10, java.util.concurrent.TimeUnit.HOURS), false, false);
}