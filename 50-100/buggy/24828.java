@org.junit.Test
public void changeExtension_withSeparator() throws java.lang.Exception {
    xyz.enhorse.commons.HandyPath original = new xyz.enhorse.commons.HandyPath(existingFile());
    java.lang.String newExtension = ((HandyPath.EXTENSION_SEPARATOR) + "new") + (xyz.enhorse.commons.HandyPathTest.extension);
    xyz.enhorse.commons.HandyPath changed = original.changeExtension(newExtension);
    assertEquals(newExtension, ((HandyPath.EXTENSION_SEPARATOR) + (changed.extension())));
}