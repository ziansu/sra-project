@org.testng.annotations.Test
public void saveImage() throws java.lang.Exception {
    try (java.io.InputStream image = dockerClient.saveImageCmd("busybox").exec()) {
        org.hamcrest.MatcherAssert.assertThat(image.available(), org.hamcrest.Matchers.greaterThan(0));
    }
}