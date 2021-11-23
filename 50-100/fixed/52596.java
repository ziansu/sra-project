public static void main(java.lang.String[] args) {
    java.lang.System.out.println("---ModelStructureDataGenerater Start---");
    new ModelStructureDataGenerater().generater();
    java.lang.System.out.println("---ModelStructureDataGenerater End---");
    java.lang.System.out.println("---ModelControllerGenerater Start---");
    new ModelControllerGenerater().generater();
    java.lang.System.out.println("---ModelControllerGenerater End---");
    java.lang.System.out.println("---ModelGetterGenerater Start---");
    new ModelGetterGenerater().generate();
    java.lang.System.out.println("---ModelGetterGenerater End---");
    java.lang.System.out.println("---ModelSetterGenerater Start---");
    new ModelSetterGenerater().generater();
    java.lang.System.out.println("---ModelSetterGenerater End---");
    java.lang.System.out.println("all done!");
}