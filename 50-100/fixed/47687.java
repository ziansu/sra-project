@org.junit.Test
public void diskImagesExist() {
    org.mockito.Mockito.doReturn(true).when(validator).isDiskExists(disk1.getId());
    org.mockito.Mockito.doReturn(true).when(validator).isDiskExists(disk2.getId());
    org.junit.Assert.assertEquals(ValidationResult.VALID, validator.diskImagesNotExist());
}