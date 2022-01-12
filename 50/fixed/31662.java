@cucumber.annotation.en.Then(value = "^It should be converted to Celsius as (\\d+) degree$")
public void It_should_be_converted_to_Celsius_as_degree(int arg1) throws java.lang.Throwable {
    assertEquals(temperatureConverterPage.actualResult(), temperatureConverterPage.expectedResult());
    driver.quit();
}