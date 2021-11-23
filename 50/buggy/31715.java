@org.junit.Test
public void testSetPref() {
    _settings.updatePrefFilePath("savefile.json");
    assertEquals("savefile.json", _settings.getPrefFilePath());
    _settings.updatePrefFilePath("tasks.json");
    assertEquals("tasks.json", _settings.getPrefFilePath());
}