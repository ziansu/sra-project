private static void validateOutputDir(com.telerik.InputParameters inputParameters, java.lang.String nextParam) {
    if (nextParam.startsWith("-")) {
        throw new java.lang.IllegalArgumentException((("You need to pass output dir to " + (com.telerik.Main.OUT_DIR)) + " flag"));
    }
    java.io.File outputDir = new java.io.File(nextParam);
    if (!(outputDir.exists())) {
        java.lang.System.out.println(java.lang.String.format("We didn't find the folder you specified ( %s ), so it's going to be created!", inputParameters.getOutputDir().getAbsolutePath()));
        inputParameters.setOutputDir(outputDir);
    }
}