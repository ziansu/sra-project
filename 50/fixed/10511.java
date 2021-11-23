@org.junit.Before
public void setUp() throws java.io.FileNotFoundException {
    config = pl.touk.sputnik.configuration.ConfigurationBuilder.initFromResource("test-sonar.properties");
}