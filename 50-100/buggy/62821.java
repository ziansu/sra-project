public static java.io.File findMavenTargetJar(java.lang.String module, java.lang.String name) throws java.io.IOException {
    if (new java.io.File(module).isDirectory()) {
        java.io.File inModule = new java.io.File(((module + "/target/") + name));
        if (inModule.isFile()) {
            return inModule;
        }
    }
    java.io.File local = new java.io.File(("target/" + name));
    if (local.isFile()) {
        return local;
    }
    throw new java.io.IOException(("No such jar file: " + name));
}