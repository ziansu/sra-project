@org.junit.Test
public void testSave() {
    de.mbrero.see.persistance.dto.TestRun run = new de.mbrero.see.persistance.dto.TestRun();
    run.setInputPath("foo/test.xml");
    run.setDate(new java.util.Date());
    run.setResult(TestRunResults.SUCCESS.toString());
    repo.save(run);
    java.util.ArrayList<de.mbrero.see.persistance.dto.TestRun> items = ((java.util.ArrayList<de.mbrero.see.persistance.dto.TestRun>) (repo.getAll()));
    org.junit.Assert.assertEquals(1, items.size());
}