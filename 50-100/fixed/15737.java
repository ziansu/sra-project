@org.junit.Test
public void testDeleteFail() throws application.logic.NoDescriptionException, java.io.IOException {
    java.util.ArrayList<application.storage.Task> tasklist = new java.util.ArrayList<application.storage.Task>();
    tasklist = logic.loadDataFile();
    application.logic.Feedback fb = logic.executeCommand("play dota from 30 april 1pm to 2pm at home", tasklist);
    fb = logic.executeCommand("delete 0", tasklist);
    org.junit.Assert.assertEquals("Please enter a valid number.", fb.getMessage());
    org.junit.Assert.assertTrue(((tasklist.size()) == 1));
    logic.executeCommand("delete 1", tasklist);
}