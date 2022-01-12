@org.junit.Test
public void testDirectoryExists() throws edu.utsa.fileflow.client.fileflow.FileStructureException {
    edu.utsa.fileflow.client.fileflow.FileStructure fs = new edu.utsa.fileflow.client.fileflow.FileStructure();
    fs.createDirectory(new edu.utsa.fileflow.client.fileflow.VariableAutomaton("/home"));
    org.junit.Assert.assertTrue("'/' should exist", fs.fileExists(dk.brics.automaton.Automaton.makeString("/")));
    org.junit.Assert.assertTrue("'/home' should exist", fs.fileExists(dk.brics.automaton.Automaton.makeString("/home")));
    org.junit.Assert.assertFalse("'/fake' should not exist", fs.fileExists(dk.brics.automaton.Automaton.makeString("/fake")));
}