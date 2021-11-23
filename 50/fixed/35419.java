@org.junit.Test
public void testProcessSporadicTasks() {
    org.junit.Assert.assertEquals(1, edu.ksu.cis.projects.mdcf.aadltranslator.test.arch.ProcessModelTests.logicModel.getSporadicTasks().size());
    org.junit.Assert.assertEquals(1, edu.ksu.cis.projects.mdcf.aadltranslator.test.arch.ProcessModelTests.processOnlyProcessModel.getSporadicTasks().size());
}