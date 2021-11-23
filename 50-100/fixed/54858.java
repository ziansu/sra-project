@org.junit.jupiter.api.BeforeAll
public static void setUp() {
    ru.histone.v2.SimpleCompilerTest.parser = new ru.histone.v2.parser.Parser();
    ru.histone.v2.SimpleCompilerTest.evaluator = new ru.histone.v2.evaluator.Evaluator();
    ru.histone.v2.evaluator.resource.SchemaResourceLoader loader = new ru.histone.v2.evaluator.resource.SchemaResourceLoader();
    loader.addLoader(new ru.histone.v2.evaluator.resource.loader.DataLoader());
    loader.addLoader(new ru.histone.v2.evaluator.resource.loader.HttpLoader(ru.histone.v2.SimpleCompilerTest.executor));
    loader.addLoader(new ru.histone.v2.evaluator.resource.loader.FileLoader());
    ru.histone.v2.SimpleCompilerTest.rtti = new ru.histone.v2.rtti.RunTimeTypeInfo(ru.histone.v2.SimpleCompilerTest.executor, loader, ru.histone.v2.SimpleCompilerTest.evaluator, ru.histone.v2.SimpleCompilerTest.parser);
}