static cml.frontend.Compiler create() {
    final cml.io.Console console = cml.io.Console.create();
    final cml.io.FileSystem fileSystem = cml.io.FileSystem.create();
    final cml.language.ModelLoader modelLoader = cml.language.ModelLoader.create(console, fileSystem);
    final cml.generator.Generator generator = cml.generator.Generator.create(console, fileSystem);
    return new cml.frontend.CompilerImpl(console, modelLoader, generator);
}