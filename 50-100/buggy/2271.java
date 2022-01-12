@java.lang.Override
public void generateModelFromSourceFile(java.lang.String sourceFilePath) {
    try {
        compilationUnit = null;
        charStream = null;
        husacct.analyse.task.analyse.java.parsing.JavaParser javaParser = generateJavaParser(sourceFilePath);
        int nrOfLinesOfCode = determineNumberOfLinesOfCode();
        new husacct.analyse.task.analyse.java.analysing.CompilationUnitAnalyser(compilationUnit, sourceFilePath, nrOfLinesOfCode, javaParser);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}