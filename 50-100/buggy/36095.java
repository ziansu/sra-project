@org.junit.Test
public void testInvalidFile() throws edu.nyu.cs.javagit.client.cli.PorcelainParseWrongFormatException {
    edu.nyu.cs.javagit.client.cli.CliGitStatus.GitStatusParser parser = new edu.nyu.cs.javagit.client.cli.CliGitStatus.GitStatusParser(repositoryDirectory);
    edu.nyu.cs.javagit.api.commands.GitStatusResponse response = null;
    parser.parseLine("error: pathspec 'foobar' did not match any file(s) known to git.");
    try {
        response = parser.getResponse();
        fail("Failed to throw JavaGitException for an invalid filename");
    } catch (edu.nyu.cs.javagit.api.JavaGitException e) {
        assertEquals("JavaGitException code", 438000, e.getCode());
        assertEquals("response object", null, response);
    }
}