@org.junit.Test
public void testGetAllMethods() throws java.io.IOException, org.eclipse.core.runtime.CoreException {
    project = org.springsource.ide.eclipse.commons.tests.util.StsTestUtil.createPredefinedProject("validation", "org.springframework.ide.eclipse.beans.core.tests");
    org.eclipse.jdt.core.IType foo = org.springframework.ide.eclipse.core.java.JdtUtils.getJavaType(project, "org.springframework.SubClass");
    java.util.Set<org.eclipse.jdt.core.IMethod> methods = org.springframework.ide.eclipse.core.java.Introspector.getAllMethods(foo);
    checkResult(methods, 24);
    org.eclipse.jdt.core.IType base = org.springframework.ide.eclipse.core.java.JdtUtils.getJavaType(project, "org.springframework.Base");
    methods = org.springframework.ide.eclipse.core.java.Introspector.getAllMethods(base);
    checkResult(methods, 20);
}