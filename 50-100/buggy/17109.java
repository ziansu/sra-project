@org.junit.Test
public void deleteTest() throws java.lang.Exception {
    java.lang.String applicationName = "deleted-app";
    int nbApplicationBefore = applicationRepository.findAll().size();
    applicationRepository.delete(applicationName);
    java.util.Optional<io.gravitee.repository.management.model.Application> optional = applicationRepository.findById(applicationName);
    int nbApplicationAfter = applicationRepository.findAll().size();
    org.junit.Assert.assertFalse("Deleted application always present", optional.isPresent());
    org.junit.Assert.assertEquals("Invalid number of applications after deletion", (nbApplicationBefore - 1), nbApplicationAfter);
}