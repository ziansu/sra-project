javassist.CtClass toCtClass() throws java.io.IOException {
    try (java.io.InputStream is = jarFile.getInputStream(entry)) {
        return classPool.makeClass(is);
    }
}