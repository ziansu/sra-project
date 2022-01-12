@org.junit.Test
public void testRemoveRules() throws java.lang.Exception {
    org.omegat.languagetools.LanguageToolWrapper wrapper = new org.omegat.languagetools.LanguageToolWrapper(true) {
        public boolean isEnabled() {
            return true;
        }
    };
    wrapper.onProjectChanged(PROJECT_CHANGE_TYPE.LOAD);
    java.util.List<org.omegat.gui.editor.mark.Mark> marks = wrapper.getMarksForEntry(null, "This is some long text without translation.", "", true);
    assertEquals(0, marks.size());
    marks = wrapper.getMarksForEntry(null, "This is text with the same translation.", "This is text with the same translation.", true);
    assertEquals(0, marks.size());
}