public static void main(java.lang.String[] args) {
    java.lang.String parDir = new java.io.File("").getAbsolutePath();
    java.lang.String pathToSampleData = parDir + "/src/test/sample_data.txt";
    if ((args.length) == 1) {
        pathToSampleData = args[0];
    }
    main.InputAndAnalysis iaa = new main.InputAndAnalysis(pathToSampleData);
    iaa.run();
    java.lang.System.out.print(iaa);
}