@org.junit.Test
public void generateEmployee() throws org.telosys.tools.generator.GeneratorException {
    org.telosys.tools.generator.api.GeneratorRunner generatorRunner = getGeneratorRunner();
    generatorRunner.generateEntity("Employee", "Employee.java", org.telosys.tools.generator.api.GeneratorRunnerTest.OUTPUT_FOLDER, "jpa_bean_with_links.vm");
}