@org.junit.Before
public void setup() {
    underTest = new org.dataconservancy.packaging.gui.services.FilenameValidatorService(configuration);
    contentRootPath = this.getClass().getResource("/FileNameTest/").getPath();
}