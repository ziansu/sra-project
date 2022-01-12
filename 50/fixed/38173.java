@org.junit.Test
public void getFullPathWithEmptyFileExtension() {
    final com.alliander.osgp.domain.core.valueobjects.FirmwareLocation subject = new com.alliander.osgp.domain.core.valueobjects.FirmwareLocation("flexovltest.cloudapp.net", "/firmware");
    org.junit.Assert.assertThat(subject.getFullPath("ame-v1.0"), org.hamcrest.core.IsEqual.equalTo("/firmware/ame-v1.0"));
}