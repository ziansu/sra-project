private void writeImports(java.io.Writer writer, java.lang.String className) throws java.io.IOException {
    final java.lang.String currentPackageName = ru.spbau.mit.SimpleImplementor.getPackageName(className);
    if (!(currentPackageName.isEmpty())) {
        writer.append("package ").append(currentPackageName).append(";").append(ru.spbau.mit.SimpleImplementor.NEW_LINE);
    }
}