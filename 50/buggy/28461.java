@java.lang.Override
protected void registerMethodReturnValueAnalyses(edu.psu.cse.siis.ic3.Ic3CommandLineArguments commandLineArguments) {
    edu.psu.cse.siis.ic3.AndroidMethodReturnValueAnalyses.registerAndroidMethodReturnValueAnalyses(commandLineArguments.getAppName());
}