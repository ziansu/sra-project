@org.junit.Test
public void getDomainWithTrailingSlash() {
    final com.alliander.osgp.domain.core.valueobjects.FirmwareLocation subject = new com.alliander.osgp.domain.core.valueobjects.FirmwareLocation("flexovltest.cloudapp.net/", "firmware", "zip");
    org.junit.Assert.assertThat(subject.getDomain(), org.hamcrest.core.IsEqual.equalTo("flexovltest.cloudapp.net"));
}