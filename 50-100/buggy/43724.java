@org.junit.Test
public void testDeleteById() {
    de.mbrero.see.persistance.dto.TestRun run = new de.mbrero.see.persistance.dto.TestRun();
    run.setInputPath("foo/test.xml");
    run.setDate(new java.util.Date());
    run.setResult(TestRunResults.SUCCESS);
    repo.save(run);
    repo.delete(1);
    java.util.ArrayList<de.mbrero.see.persistance.dto.TestRun> items = ((java.util.ArrayList<de.mbrero.see.persistance.dto.TestRun>) (repo.getAll()));
    org.junit.Assert.assertEquals(0, items.size());
}