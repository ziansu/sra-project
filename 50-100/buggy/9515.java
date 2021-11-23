@org.junit.Test
public void testSetArgsMultipleNewFiles() throws java.lang.Exception {
    try {
        com.nononsenseapps.filepicker.FilePickerFragmentTest.fragment.setArgs(null, AbstractFilePickerFragment.MODE_NEW_FILE, true, false, true);
        org.junit.Assert.fail("Expected exception");
    } catch (java.lang.IllegalArgumentException e) {
        org.junit.Assert.assertTrue(("Should mention the mode limitations: " + (e.getMessage())), e.getMessage().contains("MODE_NEW_FILE"));
    }
}