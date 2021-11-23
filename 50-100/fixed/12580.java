@org.junit.Test
public void testDoesExtend() throws java.io.IOException, org.eclipse.core.runtime.CoreException {
    project = org.springsource.ide.eclipse.commons.tests.util.StsTestUtil.createPredefinedProject("validation", "org.springframework.ide.eclipse.beans.core.tests");
    org.eclipse.jdt.core.IType foo = org.springframework.ide.eclipse.core.java.JdtUtils.getJavaType(project, "org.springframework.SubClass");
    org.junit.Assert.assertTrue(org.springframework.ide.eclipse.core.java.Introspector.doesExtend(foo, "org.springframework.Base"));
    org.junit.Assert.assertTrue((!(org.springframework.ide.eclipse.core.java.Introspector.doesExtend(foo, "org.springframework.beans.factory.BeanFactory"))));
}