public static void main(java.lang.String[] args) {
    java.lang.String parDir = new java.io.File("").getAbsolutePath();
    java.lang.String pathToSampleData = parDir + "/src/test/sample_data.txt";
    main.InputAndAnalysis iaa = new main.InputAndAnalysis(pathToSampleData);
    iaa.run();
    java.lang.System.out.print(iaa);
}