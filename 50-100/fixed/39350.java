@org.junit.Test
public void tsLintPathSetting_definedAppropriately() {
    org.sonar.api.Property property = findPropertyByName(TypeScriptPlugin.SETTING_TS_LINT_PATH);
    assertEquals(PropertyType.STRING, property.type());
    assertEquals("", property.defaultValue());
    assertEquals(true, property.project());
    assertEquals(true, property.global());
}