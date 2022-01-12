@org.junit.Test
public void diskImagesAlreadyExistBothDoesntExist() {
    org.mockito.Mockito.doReturn(null).when(validator).getExistingDisk(org.mockito.Matchers.any(org.ovirt.engine.core.compat.Guid.class));
    org.junit.Assert.assertEquals(ValidationResult.VALID, validator.diskImagesAlreadyExist());
}