@org.junit.Test
public void testAgeFloat() {
    java.lang.Float testAge = 12.5F;
    com.movisens.movisensgattlib.characteristics.AgeFloat ageFloat = new com.movisens.movisensgattlib.characteristics.AgeFloat(testAge);
    com.movisens.movisensgattlib.characteristics.AgeFloat converted = new com.movisens.movisensgattlib.characteristics.AgeFloat(ageFloat.getBytes());
    org.junit.Assert.assertTrue(converted.getValue().equals(testAge));
}