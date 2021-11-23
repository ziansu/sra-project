@org.junit.Test
public void readUserPrefs_notJsonFormat_exceptionThrown() throws seedu.doit.commons.exceptions.DataConversionException {
    thrown.expect(seedu.doit.commons.exceptions.DataConversionException.class);
    readUserPrefs("NotJsonFormatUserPrefs.json");
}