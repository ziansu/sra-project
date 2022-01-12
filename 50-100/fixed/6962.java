@java.lang.Override
protected void registerArgumentValueAnalyses(edu.psu.cse.siis.ic3.Ic3CommandLineArguments commandLineArguments) {
    edu.psu.cse.siis.coal.arguments.ArgumentValueManager.v().registerDefaultArgumentValueAnalyses();
    edu.psu.cse.siis.coal.arguments.ArgumentValueManager.v().registerArgumentValueAnalysis("classType", new edu.psu.cse.siis.ic3.ClassTypeValueAnalysis());
    edu.psu.cse.siis.coal.arguments.ArgumentValueManager.v().registerArgumentValueAnalysis("authority", new edu.psu.cse.siis.ic3.AuthorityValueAnalysis());
    edu.psu.cse.siis.coal.arguments.ArgumentValueManager.v().registerArgumentValueAnalysis("path", new edu.psu.cse.siis.ic3.PathValueAnalysis());
}