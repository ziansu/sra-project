@org.junit.Test
public void testFindSpecificMethod() throws java.io.IOException, org.eclipse.core.runtime.CoreException {
    org.eclipse.core.resources.IProject project = org.springsource.ide.eclipse.commons.tests.util.StsTestUtil.createPredefinedProject("validation", "org.springframework.ide.eclipse.beans.core.tests");
    org.eclipse.jdt.core.IType foo = org.springframework.ide.eclipse.core.java.JdtUtils.getJavaType(project, "org.springframework.SubClass");
    org.eclipse.jdt.core.IMethod method = org.springframework.ide.eclipse.core.java.Introspector.findMethod(foo, "getDao", 0, Public.YES, Static.NO);
    org.junit.Assert.assertNotNull(method);
    project.delete(true, null);
}