protected synchronized java.lang.String sourceForModelledClass(spoon.reflect.declaration.CtType<?> modelledClass) {
    prettyPrinter.reset();
    prettyPrinter.scan(modelledClass);
    java.lang.String sourceCode = ((("package " + (modelledClass.getPackage().toString())) + ";") + (java.lang.System.getProperty("line.separator"))) + (prettyPrinter.toString());
    prettyPrinter.reset();
    return sourceCode;
}