@org.testng.annotations.Test(enabled = true)
public void testGetProjects() throws java.net.MalformedURLException, java.rmi.RemoteException, javax.xml.rpc.ServiceException {
    int issueId = 4;
    app.soap().skipIfNotFixed(issueId);
    java.util.Set<ru.stqa.pft.mantis.model.Project> projects = app.soap().getProjects();
    java.lang.System.out.println(projects.size());
    for (ru.stqa.pft.mantis.model.Project project : projects) {
        java.lang.System.out.println(project.getName());
    }
}