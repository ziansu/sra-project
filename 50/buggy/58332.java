@java.lang.Override
public void visitLocalVariable(@mockit.internal.mockups.Nonnull
java.lang.String name, @mockit.internal.mockups.Nonnull
java.lang.String desc, @mockit.internal.mockups.Nullable
java.lang.String signature, @mockit.internal.mockups.Nonnull
mockit.internal.mockups.Label start, @mockit.internal.mockups.Nonnull
mockit.internal.mockups.Label end, int index) {
    java.lang.String classDesc = mockMethods.getMockClassInternalName();
    mockit.internal.mockups.ParameterNames.registerName(classDesc, access, methodName, methodDesc, name, index);
}