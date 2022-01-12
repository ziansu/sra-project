public iotsuite.codegenerator.CompilationUnit generateComputationalServiceListener(iotsuite.semanticmodel.Information infoConsumeInfo) {
    java.lang.System.out.println(("I am in JavaFrameFromST in ComputationalService Listener....." + (infoConsumeInfo.getName())));
    org.antlr.stringtemplate.StringTemplate templateOfComputationalService = group.getInstanceOf("Common/listenerComputational");
    templateOfComputationalService.setAttribute("INFO", infoConsumeInfo);
    return new iotsuite.codegenerator.CompilationUnit((("Listener" + (infoConsumeInfo.getName())) + ".java"), templateOfComputationalService, "Listener", "Computational", infoConsumeInfo);
}