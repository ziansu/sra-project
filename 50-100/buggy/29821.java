public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String testFile;
    java.lang.String testChangedFile;
    if ((args.length) == 3) {
        testFile = args[1];
        testChangedFile = args[2];
        comparisonTool.ComparisonTool compareTool = new comparisonTool.ComparisonTool();
        try {
            java.lang.System.out.println(compareTool.Compare(testFile, testChangedFile));
        } catch (java.lang.Exception ex) {
            java.lang.System.out.println("An exception occurred:");
            java.lang.System.out.println(ex.getMessage());
        }
    }else {
        java.lang.System.out.println("Please specify two files to compare");
    }
}