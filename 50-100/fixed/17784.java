@java.lang.Override
protected boolean isValid(java.io.File path) {
    try {
        java.io.File prism = de.uni.freiburg.iig.telematik.swat.analysis.prism.searcher.PrismSearcherFactory.getPrismSearcher().validatePrismPath(path.getAbsolutePath());
        if (!(de.uni.freiburg.iig.telematik.swat.analysis.prism.PrismFunctionValidator.checkPrism(prism)))
            de.uni.freiburg.iig.telematik.swat.workbench.Workbench.errorMessage("Prism failed the execution test. this prism version might differ from prism-4.2.beta1.\br might cause trouble with SWAT", null, false);
        
    } catch (de.invation.code.toval.validate.ParameterException e) {
        return false;
    } catch (java.io.IOException e) {
        de.uni.freiburg.iig.telematik.swat.workbench.Workbench.errorMessage("Could not access prism executable", e, true);
        return false;
    }
    return true;
}