@org.junit.Test
public void changePathname_withSeparator() throws java.lang.Exception {
    xyz.enhorse.commons.HandyPath original = new xyz.enhorse.commons.HandyPath(existingFile());
    java.lang.String newPathname = ((existingDirectory()) + "new") + (HandyPath.PATH_SEPARATOR);
    xyz.enhorse.commons.HandyPath changed = original.changePathname(newPathname);
    assertEquals(newPathname, changed.pathname());
}