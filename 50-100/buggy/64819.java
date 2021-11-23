private static void findChildMavenProjects(java.util.List<org.eclipse.m2e.core.project.MavenProjectInfo> results, java.util.Collection<org.eclipse.m2e.core.project.MavenProjectInfo> infos) {
    for (org.eclipse.m2e.core.project.MavenProjectInfo info : infos) {
        results.add(info);
        java.util.Collection<org.eclipse.m2e.core.project.MavenProjectInfo> children = info.getProjects();
        if (children.isEmpty()) {
            results.add(info);
        }else {
            com.liferay.ide.maven.core.MavenUtil.findChildMavenProjects(results, children);
        }
    }
}