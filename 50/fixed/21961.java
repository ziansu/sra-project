@ru.yandex.qatools.allure.annotations.Features(value = "API")
@ru.yandex.qatools.allure.annotations.Stories(value = "SoapServices")
@ru.yandex.qatools.allure.annotations.Title(value = "createService")
@org.testng.annotations.Test
public void createService() {
    com.orasi.api.soapServices.helpers.USZipService usZip = new com.orasi.api.soapServices.helpers.USZipService();
    org.testng.Assert.assertNotNull(usZip);
}