@org.junit.Test
public void testGet() {
    de.mbrero.see.persistance.dto.TestRun run = new de.mbrero.see.persistance.dto.TestRun();
    run.setInputPath("foo/test.xml");
    run.setDate(new java.util.Date());
    run.setResult(TestRunResults.SUCCESS.toString());
    repo.save(run);
    de.mbrero.see.persistance.dto.TestRun item = ((de.mbrero.see.persistance.dto.TestRun) (repo.get(1)));
    org.junit.Assert.assertEquals("foo/test.xml", item.getInputPath());
}