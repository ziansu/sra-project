private static void printSyntax() {
    java.io.PrintStream err = java.lang.System.err;
    err.println("Syntax: ");
    err.println("WOTUtil -benchmarkRemoveTrustDestructive INPUT_DATABASE OUTPUT_GNUPLOT SEED");
    err.println("    ATTENTION: Destroys the given database!");
    err.println("    ATTENTION: OUTPUT_GNUPLOT will be appended to, not overwritten.");
    err.println("    Push ENTER to exit for pause. Resume by restarting with same parameters.");
    err.println("    Deterministic execution by SEED is not supported with resume.");
    err.println("WOTUtil -fcp INPUT_DATABASE Message=WOT_FCP_CALL key1=value1 key2=value2 ...");
    err.println("WOTUtil -dumpIdentityFile INPUT_FILE");
    err.println("WOTUtil -testAndRepair INPUT_DATABASE");
    err.println("WOTUtil -trustValueHistogram INPUT_DATABASE");
    err.println("WOTUtil -trusteeCountHistogram INPUT_DATABASE");
}