@java.lang.Override
public void visitLocalVariable(@mockit.internal.mockups.Nonnull
java.lang.String name, java.lang.String desc, java.lang.String signature, mockit.internal.mockups.Label start, mockit.internal.mockups.Label end, int index) {
    java.lang.String classDesc = mockMethods.getMockClassInternalName();
    mockit.internal.mockups.ParameterNames.registerName(classDesc, methodName, methodDesc, name);
}