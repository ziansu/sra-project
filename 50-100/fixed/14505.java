@org.junit.Test
public void programRepairWithSimpleIncorrectMethodWithDepthOne_usingDependencies_multikeymap() {
    java.lang.String sourceFolder = "src/test/resources/java/";
    java.lang.String[] dependencies = new java.lang.String[]{ "examples.stryker.multikeymap.MultiKey" , "examples.stryker.multikeymap.HashEntry" };
    repairer.JMLAnnotatedClass subject = new repairer.JMLAnnotatedClass(sourceFolder, "examples.stryker.multikeymap.MultiKeyMap");
    repairer.PrivateStryker repairer = new repairer.PrivateStryker(subject, "equalKey", dependencies, 1);
    boolean isRepaired = repairer.repair();
    org.junit.Assert.assertFalse("method cannot be repaired with this depth", isRepaired);
}