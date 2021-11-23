public static void printConfigurationProblems(java.io.PrintStream out, java.util.List<yarnandtail.andhow.ConstructionProblem> probs, yarnandtail.andhow.appconfig.AppConfigDefinition appDef) {
    if (probs.isEmpty()) {
    }else {
        out.println("CONSTRUCTION PROBLEMS  ~Foundational problems with the App Configuration.");
        out.println("~The AppConfig may have been built in an inconsistent way, such as default values that violate validation rules.");
        out.println("~When there are construction problems, no attempt is made to load configuration values.");
        out.println();
        out.println("Defailed list of Construction Problems:");
        for (yarnandtail.andhow.ConstructionProblem p : probs) {
            out.println(p.getMessage());
        }
    }
}