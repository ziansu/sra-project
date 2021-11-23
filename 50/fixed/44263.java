@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void createFirmwareLocationWithBlankDomain() {
    new com.alliander.osgp.domain.core.valueobjects.FirmwareLocation("       ", "/firmware");
}