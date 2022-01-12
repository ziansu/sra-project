@org.junit.Before
public void setUp() throws java.lang.Exception {
    source = "src/main/fsm/module.vm";
    target = new java.io.File(tempFiles.newFolder(), "module.xml");
    testling = new com.github.zaplatynski.firstspirit.modules.fsm.velocity.ModuleXmlParser(source, target, project, log, velocity);
    org.mockito.Mockito.when(project.getBasedir()).thenReturn(tempFiles.newFolder());
}