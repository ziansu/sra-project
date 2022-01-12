public void compute(ru.mrchebik.gui.node.CustomCodeArea customCodeArea) {
    if ((propertyCollector) == null) {
        propertyCollector = ru.mrchebik.settings.PropertyCollector.create();
        isJDKCorrect = propertyCollector.isJDKCorrect();
    }
    if (isJDKCorrect) {
        ru.mrchebik.highlight.syntax.switcher.javaCompiler.JavaCompilerSyntax processSyntax = new ru.mrchebik.highlight.syntax.switcher.javaCompiler.JavaCompilerSyntax(customCodeArea, project, saveTabsProcess, tabPane, treeView);
        processSyntax.start();
    }else {
        ru.mrchebik.highlight.syntax.switcher.javaSymbolSolver.JavaSymbolSolverSyntax processSyntax = new ru.mrchebik.highlight.syntax.switcher.javaSymbolSolver.JavaSymbolSolverSyntax();
        processSyntax.start();
    }
}