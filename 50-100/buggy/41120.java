private static void verifyZipContent(java.io.ByteArrayOutputStream zip, java.lang.String shouldContain) throws java.lang.Exception {
    try (java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.ByteArrayInputStream(zip.toByteArray()))) {
        java.util.zip.ZipEntry entry = zipInputStream.getNextEntry();
        org.hamcrest.MatcherAssert.assertThat(entry, org.hamcrest.Matchers.notNullValue());
        org.hamcrest.MatcherAssert.assertThat(entry.getName(), org.hamcrest.Matchers.is(shouldContain));
    }
}