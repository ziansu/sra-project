@java.lang.Override
public boolean perform(zeyt.hotfix.AbstractBuild build, zeyt.hotfix.Launcher launcher, zeyt.hotfix.BuildListener listener) {
    try {
        zeyt.hotfix.JiraSearch search = new zeyt.hotfix.JiraClientBuilder(jiraSettings).withBasicHttpAuthentication().build();
        search.searchJql(jiraSettings.getJql());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return true;
}