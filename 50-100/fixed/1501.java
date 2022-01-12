public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String model_in = "resources/model/TitoloUnico.xml";
    java.lang.System.out.println("*******STARTING THE OVERALL TRANSFORMATION*******");
    eu.learnpad.transformations.preprocessing.Alignment al = new eu.learnpad.transformations.preprocessing.Alignment();
    java.lang.String sanitazedFilePath = al.sanitizer(model_in);
    java.lang.System.out.println("Alignment Done!");
    eu.learnpad.transformations.run.MainTest mt = new eu.learnpad.transformations.run.MainTest();
    mt.executeTransformation(sanitazedFilePath);
    java.lang.System.out.println("*******FINISHED THE OVERALL TRANSFORMATION*******");
}