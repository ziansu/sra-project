@org.junit.Test
public void testExecute() throws java.lang.Exception {
    org.omegat.languagetools.LanguageToolWrapper wrapper = new org.omegat.languagetools.LanguageToolWrapper() {
        public boolean isEnabled() {
            return true;
        }
    };
    wrapper.onProjectChanged(PROJECT_CHANGE_TYPE.LOAD);
    java.util.List<org.omegat.gui.editor.mark.Mark> marks = wrapper.getMarksForEntry(null, "This is abnegation.", "To jest abnegacja.", true);
    assertEquals(1, marks.size());
    assertTrue(marks.get(0).toolTipText.contains("slovenliness"));
}