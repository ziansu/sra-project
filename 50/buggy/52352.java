private spoon.reflect.factory.Factory getSpoonFactory() {
    final spoon.Launcher launcher = new spoon.Launcher();
    launcher.run(new java.lang.String[]{ "-i" , "./src/test/java/spoon/test/comment/testclasses/" , "-o" , "./target/spooned/" , "-j" , "-c" });
    return launcher.getFactory();
}