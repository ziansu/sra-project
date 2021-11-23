@org.junit.Test
public void test() throws java.lang.Exception {
    boolean test = false;
    int projectID;
    if (test) {
        projectID = 93160273;
    }else {
        projectID = 43026762;
    }
    java.lang.String stringInput = cs.vt.analysis.analyzer.parser.Util.retrieveProjectOnline(projectID);
    project = cs.vt.analysis.analyzer.nodes.ScratchProject.loadProject(stringInput);
}