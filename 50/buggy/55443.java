public void generateComputationalServiceListener_ComputationalServiceCompiler(iotsuite.semanticmodel.Information infoConsumeInfo) {
    java.lang.System.out.println("I am in Computational Service Listener......");
    iotsuite.codegenerator.JavaFrameworkFromST generatedComputationalService = new iotsuite.codegenerator.JavaFrameworkFromST();
    iotsuite.codegenerator.CompilationUnit generatedCU = generatedComputationalService.generateComputationalServiceListener(infoConsumeInfo);
    iotsuite.codegenerator.SourceFileDumper dumpGeneratedComputationalService = new iotsuite.codegenerator.SourceFileDumper();
    dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
}