@org.junit.Test
public void saveUserPrefs_nullFilePath_assertionFailure() throws java.io.IOException {
    this.thrown.expect(java.lang.AssertionError.class);
    saveUserPrefs(new seedu.doit.model.UserPrefs(), null);
}