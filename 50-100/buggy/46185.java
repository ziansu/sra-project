@java.lang.Override
public void visit(int version, int access, @mockit.internal.expectations.mocking.NotNull
java.lang.String name, @mockit.internal.expectations.mocking.Nullable
java.lang.String signature, @mockit.internal.expectations.mocking.Nullable
java.lang.String superName, @mockit.internal.expectations.mocking.Nullable
java.lang.String[] interfaces) {
    interfaceName = name;
    java.lang.String classSignature = signature + (mockedTypeInfo.implementationSignature);
    super.visit(version, access, name, classSignature, superName, interfaces);
}