@java.lang.Override
public void visitEnd() {
    for (java.lang.String superInterface : superInterfaces) {
        new mockit.internal.classGeneration.BaseImplementationGenerator.MethodGeneratorForImplementedSuperInterface(superInterface);
    }
}