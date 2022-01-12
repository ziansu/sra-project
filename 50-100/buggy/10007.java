@org.junit.Test
public void idTest() {
    org.marc.everest.datatypes.II id = clinicalDocument.getId();
    org.junit.Assert.assertNotNull(id);
    org.junit.Assert.assertEquals(Constants.Runtime.VALID_DEMOGRAPHIC.toString(), id.getRoot());
    org.junit.Assert.assertFalse(org.oscarehr.e2e.util.EverestUtils.isNullorEmptyorWhitespace(id.getExtension()));
}