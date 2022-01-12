@java.lang.Override
protected void setUp() throws java.lang.Exception {
    java.lang.String name = getName();
    name = name.replace("$$", "/");
    name = name.replace("$", ".");
    consulo.internal.dotnet.asm.mbel.ModuleParser moduleParser = new consulo.internal.dotnet.asm.mbel.ModuleParser(new java.io.File(("testData/" + name)));
    moduleParser.parseNext();
    myModuleParser = moduleParser;
}