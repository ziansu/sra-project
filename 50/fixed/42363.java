private void assertGetResume(ru.timurnav.resume.model.Resume r) {
    org.junit.Assert.assertEquals(storage.get(r.getUuid()).toString(), r.toString());
}