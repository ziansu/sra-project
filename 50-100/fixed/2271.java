@java.lang.Override
public void generateModelFromSourceFile(java.lang.String sourceFilePath) {
    try {
        compilationUnit = null;
        charStream = null;
        husacct.analyse.task.analyse.java.parsing.JavaParser javaParser = generateJavaParser(sourceFilePath);
        new husacct.analyse.task.analyse.java.analysing.CompilationUnitAnalyser(compilationUnit, sourceFilePath, javaParser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}