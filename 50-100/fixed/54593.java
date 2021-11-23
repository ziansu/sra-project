private org.jboss.tools.openshift.egit.internal.test.util.TestRepository createTestRepository(org.jboss.tools.openshift.egit.internal.test.util.TestProject project) throws java.io.IOException, java.lang.Exception {
    org.jboss.tools.openshift.egit.internal.test.util.TestRepository testRepository = new org.jboss.tools.openshift.egit.internal.test.util.TestRepository(org.jboss.tools.openshift.egit.internal.test.util.TestUtils.createGitDir(project));
    testRepository.createMockSystemReader(org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getLocation());
    testRepository.setUserAndEmail(org.jboss.tools.openshift.egit.internal.test.EGitUtilsTest.GIT_USER, org.jboss.tools.openshift.egit.internal.test.EGitUtilsTest.GIT_EMAIL);
    testRepository.connect(project.getProject());
    testRepository.add(project.getFile(".project"));
    testRepository.initialCommit();
    return testRepository;
}