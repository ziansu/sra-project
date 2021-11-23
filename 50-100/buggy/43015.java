@org.junit.Test
public void testUpdate() {
    de.mbrero.see.persistance.dto.TestRun run = new de.mbrero.see.persistance.dto.TestRun();
    run.setInputPath("foo/test.xml");
    run.setDate(new java.util.Date());
    run.setResult(TestRunResults.SUCCESS);
    repo.save(run);
    de.mbrero.see.persistance.dto.TestRun item = ((de.mbrero.see.persistance.dto.TestRun) (repo.get(1)));
    item.setInputPath("foo/test2.xml");
    repo.update(item);
    org.junit.Assert.assertEquals("foo/test2.xml", item.getInputPath());
}