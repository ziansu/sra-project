@org.junit.Test
public void testfindAllConstructor() throws java.io.IOException, org.eclipse.core.runtime.CoreException {
    org.eclipse.core.resources.IProject project = org.springsource.ide.eclipse.commons.tests.util.StsTestUtil.createPredefinedProject("validation", "org.springframework.ide.eclipse.beans.core.tests");
    org.eclipse.jdt.core.IType foo = org.springframework.ide.eclipse.core.java.JdtUtils.getJavaType(project, "org.springframework.SubClass");
    java.util.Set<org.eclipse.jdt.core.IMethod> cons = org.springframework.ide.eclipse.core.java.Introspector.findAllConstructors(foo);
    org.junit.Assert.assertTrue((!(cons.isEmpty())));
    org.junit.Assert.assertTrue(((cons.toArray().length) == 5));
    project.delete(true, null);
}