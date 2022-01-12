private void generateMultiMethods(org.multij.model.Module module, java.io.PrintWriter writer) {
    for (org.multij.model.MultiMethod multiMethod : module.getMultiMethods()) {
        for (org.multij.model.EntryPoint entryPoint : multiMethod.getEntryPoints()) {
            org.multij.codegen.CodeGenerator.MethodCodeGenerator gen = new org.multij.codegen.CodeGenerator.MethodCodeGenerator(module.getTypeElement().getQualifiedName(), writer, entryPoint);
            gen.generateCode();
        }
    }
}