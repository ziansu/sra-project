public java.lang.String getPackageGenDir(org.kevoree.modeling.kotlin.generator.GenerationContext ctx, org.kevoree.modeling.kotlin.generator.EPackage pack) {
    java.lang.String modelGenBaseDir = (ctx.rootGenerationDirectory.getAbsolutePath()) + "/";
    modelGenBaseDir += (fqn(pack).replace(".", "/")) + "/";
    return modelGenBaseDir;
}