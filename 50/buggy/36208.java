@org.junit.Test
public void bootstrapPropertiesExist() {
    org.junit.Assert.assertTrue(environment.getPropertySources().contains("bootstrap"));
}